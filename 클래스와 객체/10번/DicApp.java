package Homework;

import java.util.Scanner;

public class DicApp {

	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
		System.out.println("�ѿ� �ܾ� �˻� ���α׷��Դϴ�.");
		
		String s=null;
			
		while(true) {
			System.out.print("�ѱ� �ܾ�?");
			String korWord = scanner.next();
			if(korWord.equals("�׸�"))
				break;
			else
				s = Dictionary.kor2Eng(korWord); 
			//�ٸ� Ŭ������ �ִ� static �޼ҵ� ȣ��� �ν��Ͻ������� �����ϱ� ���� 
			//static��� Ŭ���������� �޼ҵ� �����Ѵ�.
				System.out.println(s);
		}
		
		scanner.close();
	}

}
