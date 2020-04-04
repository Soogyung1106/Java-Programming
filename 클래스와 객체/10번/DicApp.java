package Homework;

import java.util.Scanner;

public class DicApp {

	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
		System.out.println("한영 단어 검색 프로그램입니다.");
		
		String s=null;
			
		while(true) {
			System.out.print("한글 단어?");
			String korWord = scanner.next();
			if(korWord.equals("그만"))
				break;
			else
				s = Dictionary.kor2Eng(korWord); 
			//다른 클래스에 있는 static 메소드 호출시 인스턴스식으로 접근하기 보단 
			//static답게 클래스명으로 메소드 접근한다.
				System.out.println(s);
		}
		
		scanner.close();
	}

}
