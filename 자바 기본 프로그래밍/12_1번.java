//12-(1)번 if-else문 이용해 작성

import java.util.Scanner; //Scanner 함수 패키지 포함
public class Calculator1 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in); //Scanner의 객체 생성
		System.out.println("연산자는 +, - , *, / 네 가지로 한다.");
		System.out.println("연산>>");
		double a= scanner.nextDouble(); //첫 번째 피연산자 입력
		String s= scanner.next(); //사용자가 적을 연산자
		double b= scanner.nextDouble(); //두 번째 피연산자 입력
		
		double result=0; //연산 결과를 담아둘 변수
	
		if(s.equals("+"))
			result=a+b;
		else if(s.equals("*"))
			result=a*b;
		else if(s.equals("-"))
			result=a-b;
		else if(s.equals("/"))
			if(b==0) //나누는 수 즉, 2번째로 입력하는 수가 0일 때
				System.out.println("0으로 나눌 수 없습니다.");
			else
				result=a/b;
		else
			System.out.println("연산자는 +, -, *, / 외에 입력할 수 없습니다."); //예외처리
		
		
		if(s.equals("+")||s.equals("-")||s.equals("*")||(s.equals("/")&& b !=0)) //+, *, /(0으로 나누지 않을 경우) 이 세가지 경우에만 아래 결과 출력
			System.out.println(a+s+b+"의 계산 결과는 "+result);

		scanner.close(); //Scanner 객체 다 썼으므로 반납
		
	}//end main

}//end class
