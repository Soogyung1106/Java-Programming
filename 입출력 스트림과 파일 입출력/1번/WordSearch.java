import java.io.*; //입출력 클래스 사용하기 위해 패키지 임포트
import java.util.*; //스캐너 클래스와 컬렉션 클래스 사용하기 위해 패키지 임포트

//주의!! words.txt 파일을 저장한 위치 : c드라이브의 Temp 디렉토리

/* <문제1 : 해결해야 할 것>
 * 파일을 찾아 읽은 후,
 * 배열에 저장하고,
 * 배열에서 사용자가 입력한 단어로 시작하는 단어 찾기  
*/

public class WordSearch {
	
	//컬렉션 클래스(ArrayList)의 객체 생성 : 파일에서 읽은 데이터를 저장할 배열
	ArrayList <String> wordArray = new ArrayList<String>(); //ArrayList 생성
	
	//멤버1 : readFile() 파일을 읽는 메소드
	private void readFile() {
		FileInputStream fin = null;
		
		try {
			
			//<1단계> 읽기 전용 바이트 스트림 생성 후 파일 찾아 연결
			fin = new FileInputStream("c:\\Temp\\words.txt"); //파일이 있는 위치 : c드라이브의 Temp 디렉토리
			/*FileInputStream 클래스를 사용하는 이유 : 
			  읽기 전용 바이트 스트림(텍스트, 바이너리 형식 모두 접근 가능)   
			*/
			
			Scanner fileScanner = new Scanner(fin);
			//스캐너 클래스에 파일을 객체로 주고 읽어들이게 함.
			
			
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
			System.out.println("words.txt 파일 읽는 중 오류 발생");
		}
	}
	
	//멤버2 : wordQuery() 단어 검색을 시행하는 메소드
	private void wordQuery() {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			
			//검색할 단어 입력
			System.out.print("단어>> ");
			String findword = scanner.nextLine(); //사용자가 입력시 공백을 허용할 것이므로 
		
			int n=findword.length(); //n : 사용자가 입력한 단어의 길이 -> 나중에 배열에 저장된 단어를 이 길이만큼 자르기 위해
			int count=0; //count : 단어 찾지 못한 경우 판별용 -> 배열을 끝까지 다 돌았는데 사용자가 입력한 단어를 찾지 못할 경우 count는 그대로 0 유지 
			
			//<3단계> arrayList 배열에서 단어 검색 (wordArray)
			for(int i=0;i<wordArray.size();i++) { //배열의 크기만큼 반복
				String arrword = wordArray.get(i); //배열에 저장된 단어 가져오기 -> get(i) 메소드로
				
				//(1)배열에 저장된 단어들 중에 사용자가입력한 단어보다 단어 길이가 짧은 경우
				if(arrword.length() < n)
					continue; //검색 대상에서 제외되므로 i++로 이동
				
				//(2)입력 받은 문자열의 길이만큼 배열 안에 있는 단어들을 자르기
				String cutword = arrword.substring(0, n);
				
				if(findword.equals(cutword)) {//비교해서 같으면 
					System.out.println(arrword); //단어 앞에서 끝까지 출력
					count++;
				}
				//(3)배열을 다 돌았는데 찾지 못했을 경우
				if(i==wordArray.size()-1 && count==0) //맨 마지막 인덱스일 때 count의 상태가 0이라면..
					System.out.println("발견할 수 없습니다..");
			}
			
			/*<Idea> 
			 * 입력 받은 문자열의 길이만큼 배열 안에 있는 단어들을 잘라서 앞부분 비교 -> String 클래스의 substring() 메소드 사용
			 * (경우의 수) 
			 * -> 배열에 저장된 단어들 중에 사용자가입력한 단어보다 단어 길이가 짧은 경우 : 검색 대상에서 제외
			 * -> 배열을 다 돌았는데 찾지 못했을 경우 : 
			 */
			
			
			//무한 반복문 종료조건
			if(findword.equals("exit")) {
				System.out.println("종료합니다...");
				break; //while문 벗어나는 경우 그 다음에 시행할 명령문 없으므로 프로그램 완전히 끝남
			}//end if
			
		}//end while
		scanner.close(); //스캐너 객체 반납
		
	}//end wordQuery()
	
	
	//main
	public static void main(String[] args) {
		//클래스의 객체 생성
		WordSearch ws = new WordSearch(); 
		//메소드 호출해서 실행
		ws.readFile(); //1. words.txt 파일 읽기
		ws.wordQuery();//2. 단어 검색하기 
	}

}
