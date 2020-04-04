import java.io.*; //파일 입출력, 
import java.util.*;

//주의!! p2-sample.txt의 위치 : c드라이브의 Temp 디렉토리에 위치
/*<문제2 : 해결해야 할 것>
 * 파일에서 한 줄씩 입력 받아  
 * 배열에 저장 후,
 * 순서대로 출력 -> ArrayList 컬렉션 클래스 사용
 * 역순으로 출력 -> LinkedList 컬렉션 클래스 사용해서 스택(push, pop) 구현
 */

//Fifo : 순서대로 출력하기 위한 클래스
public class Fifo {
	
	//컬렉션 클래스(ArrayList)의 객체 생성 : 파일에서 읽은 데이터를 저장할 fifo 출력용 배열
	static ArrayList <String> wordArray = new ArrayList<String>(); //ArrayList 생성
	
	//멤버1 : readFile() 파일을 읽는 메소드
	private void readFile() {
		FileInputStream fin = null;
		
		try {
			
			//<1단계> 읽기 전용 바이트 스트림 생성 후 파일 찾아 연결
			fin = new FileInputStream("c:\\Temp\\p2-sample.txt"); //파일이 있는 위치 : c드라이브의 Temp 디렉토리
			/*FileInputStream 클래스를 사용하는 이유 : 
			  읽기 전용 바이트 스트림(텍스트, 바이너리 형식 모두 접근 가능)   
			*/
			
			Scanner fileScanner = new Scanner(fin);
			//스캐너 클래스에 파일을 객체로 주고 읽어들이게 함.
			/*Scanner 클래스를 사용하는 이유 : */
			
			while(fileScanner.hasNext()) { //그 다음에 읽을 것이 남아있으면 true 반환
			
				//<2단계> 파일에서 읽은 내용 arrayList <String> 배열에 한 줄씩 저장하기 
				wordArray.add(fileScanner.nextLine());  
				/*(설명) 
				한 줄 당 한 단어가 저장되어 있으므로 Scanner 클래스의 nextLine() 메소드 사용
				\n을 포함하는 한 라인을 읽고 \n을 제외한 나머지 문자열 리턴
				*/
			}
			
			fileScanner.close(); //스캐너 객체 반납
			
		}
		catch(IOException e) {
			System.out.println("p2-sample.txt 파일 읽는 중 오류 발생");
		}
	}
	
	//멤버2 : fifo() 파일에 있는 순서대로 출력하는 메소드
	private void fifoPrint() {
		for(int i=0;i<wordArray.size();i++) {
			System.out.println(wordArray.get(i)); //배열에 저장된 단어 가져오기 -> get(i) 메소드로
		}
	}
	
	
	//main
	public static void main(String[] args) {
		
		//객체 생성
		Fifo fifo = new Fifo(); 
		
		fifo.readFile(); //1. 파일 읽기
		fifo.fifoPrint(); //2. 파일에 있는 순서대로 출력(fifo)
		
		//객체 생성
		Lifo lifo = new Lifo();
		lifo.lifoPrint();
		//3. 파일에 저장되어 있는 역순으로 출력(lifo)
	}

}

//Lifo : 역순으로 출력하기 위한 클래스 
class Lifo {
	
	int index=0;
	LinkedList <String> wordLinked = new LinkedList<String> ();
	/*LinkedList의 객체 생성 : 파일에서 읽은 데이터를 저장할 lifo 출력용 배열
	  -> 동시에 스택에 요소를 저장할 공간 배열로 사용 
	*/
	
	//(1) 스택의 push() 구현
	public void push() {
		
		for(int j=0;j<Fifo.wordArray.size();j++) {
			wordLinked.add(Fifo.wordArray.get(j));
			index++;
		}
	}
	
	//(2) 스택의 pop() 구현
	public void pop() {
		
		while(true) {
			index--; //index 현재 상태는 배열의 총 갯수이다. 뒤에서 배열의 맨 끝 요소를 출력하면 개수-1이므로 하나 감소  
			System.out.println(wordLinked.get(index)); 
			if(index==0) //
				break;
		}	
	}
	
	//화면에 출력 <- 메소드 실행순서  push 그다음 pop..
	public void lifoPrint() {
		push();
		pop();
	}
}
