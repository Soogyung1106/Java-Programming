import java.io.*; // BufferedReader, FileReader, IOException 클래스 포함
import java.util.StringTokenizer;
//<해결해야 할 것>
//points.txt 파일을 찾아서 읽어와 - 1-(1)
//그 중 점들의 좌표를 move.txt에 저장 - 1-(2)
//구성된 모든 선들의 길이를 구하고 - (2)
//모든 선 길이의 합 - (3)
//결과 출력 - (4)
public class Point {

	public static void main(String[] args) {
		
		
		double arr[] = new double[9]; //파일 안에 있는 요소들을 읽혀 저장될 실수 배열
		int i=0;  //arr 배열의 인덱스를 표현할 변수
		
		StringTokenizer st = null;
		
		//1-(1) points.txt 파일 안의 내용 읽어서 배열에 저장하기
		try {
			
			//1단계 : 파일 입력 스트림 생성-> 파일의 이름 찾아서 스트림 연결
			
			BufferedReader fin = new BufferedReader(new FileReader("c:\\Temp\\points.txt"));
			//2단계 : 파일의 내용 읽어오기
			String s;
			
			
			while((s = fin.readLine())!= null) { //한 문자씩 파일 끝까지 읽기
				
				st = new StringTokenizer(s, " "); //읽어온 문자열에서 " "를 기준으로 토큰
				while(st.hasMoreTokens()) { //토큰이 있는 동안
					arr[i]= Double.parseDouble(st.nextToken()); 
					//다음 토큰(문자열) 리턴해서 실수로 형변환한 후 배열에 저장 
					i++;
				}	
			}
			
			//3단계 : 스트림 닫기
			fin.close();
		}//end try
		catch(IOException e) {
			System.out.println("입출력 오류");
		}
		
		//1-(2)
		//points.txt 파일에서 점들의 좌표만 move.txt에 저장 
		
		try {
			PrintWriter out = new PrintWriter("c:\\Temp\\move.txt"); //c:\\Temp\\points.txt 경로명
			
			for(i=1;i<arr.length;i++) //2번째 인덱스부터 점들을 move.txt 파일에 작성 
				out.print(arr[i]+" "); // 스페이스바로 숫자들 구분
				
			out.close();
		}catch(IOException e) {
			System.out.println("입출력 오류");
		}
		
	
		//(2), (3), (4) 구성된 모든 선들의 길이와 그 합 구해서 결과 출력
		
		double d=0; //선의 길이(두 점 사이의)
		double sum=0;//선들 길이의 총합
		int count=0;
		
		/*<for문을 구성할 규칙 찾기>
				double d1=0; //(arr[3]-arr[1])의 제곱 + (arr[4]-arr[2])의 제곱 루트
				double d2=0; //(arr[5]-arr[3])의 제곱 + (arr[6]-arr[4])의 제곱 루트
				double d3=0; //(arr[7]-arr[5])의 제곱 + (arr[8]-arr[6])의 제곱 루트
				
				점 3개일 때 -> j=5 = 3*2-1
				점 4개일 때 -> j=7 = 4*2-1
				점 5개일 때 -> j=9 = 5*2-1
				
				(규칙) 점의 개수-> j = 선의 개수 * 2 -1 
		*/
		
		
		for(int j=1;j<=(arr[0]-1)*2-1;j++) { //선의 개수 = 점의 개수 -1 
			
			if(j!=1) { 
				j++;
				count++;
				double temp = Math.pow(arr[j+2]-arr[j] ,2)+Math.pow(arr[j+3]-arr[j+1],2); //{(x2-x1)의 제곱 + (y2, y1)의 제곱}
				d=Math.sqrt(temp); // 두 점사이의 거리 d = {(x2-x1)의 제곱 + (y2, y1)의 제곱}에 루트
				System.out.println("선"+count+"의 길이 : "+d);
				sum +=d;
			}
			else {//j=1인 경우 즉, 맨 처음에만 해당
				count++;
				double temp = Math.pow(arr[j+2]-arr[j] ,2)+Math.pow(arr[j+3]-arr[j+1],2); //{(x2-x1)의 제곱 + (y2, y1)의 제곱}
				d=Math.sqrt(temp); // 두 점사이의 거리 d = {(x2-x1)의 제곱 + (y2, y1)의 제곱}에 루트
				System.out.println("선"+count+"의 길이 : "+d);
				sum+=d;//구한 선들의 길이 누적해서 합하기.
			}
		}
	
		System.out.println("모든 선들의 길이의 총합 : "+sum);
		
	}

}
