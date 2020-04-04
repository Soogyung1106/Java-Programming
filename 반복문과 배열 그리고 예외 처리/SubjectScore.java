import java.util.Scanner;
/* Ch3 14번 문제
 * 과목과 점수가 짝을 이루도록 2개의 배열을 생성한 후 과목 이름을 입력받아 점수를 출력하고 "그만"을 입력받으면 종료한다.
 * */
public class SubjectScore {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String subject[]= {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
		int score []= {95, 88, 76, 62, 55};
		
		while(true) {
			System.out.print("과목이름>>");
			String s = scanner.next();
						
			if(s.equals("그만")) //무한 반복문을 빠져나갈 조건	
				break; //전체 반복문 종료됨 -> if문이 아니라
			
			else {
				
				//for문으로 돌려서 배열의 각 요소와 입력한 문자열 비교하기 
				for(int i=0;i<subject.length;i++) {
					if(s.equals(subject[i])) {
						System.out.println(subject[i]+"점수는 "+score[i]);
						break; //for문을 벗어나는 break -> 뒤에 인덱스는 볼 필요 없음
					}
					//<i=4로 끝나는 경우>
					//(1) s.equals(subject[4])인 경우 i=4인 상태로 for문 종료됨
					//(2) 인덱스 0부터 4까지 입력한 문자열과 같은 것을 찾지 못했다면 i = 4상태로 끝남
					
					else { // !(s.equals(subject[i]))인 경우에서
						if(i==4) //그 중에 i=4인 경우
							System.out.println("없는 과목입니다.");			
					}
				}//end for
		
			}//end else
			
		}//end while
		
		scanner.close(); //더 이상 scanner객체 안 쓰므로 반납
	}//end main
	
}//end class
