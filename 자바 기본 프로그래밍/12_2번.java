//12-(2)�� switch�� �̿��� �ۼ�

import java.util.Scanner; //Scanner �Լ� ��Ű�� ����
public class Calculator2 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in); //Scanner�� ��ü ����
		System.out.println("�����ڴ� +, - , *, / �� ������ �Ѵ�.");
		System.out.println("����>>");
		double a= scanner.nextDouble(); //ù ��° �ǿ����� �Է�
		String s= scanner.next(); //����ڰ� ���� ������
		double b= scanner.nextDouble(); //�� ��° �ǿ����� �Է�
		
		double result=0; //���� ����� ��Ƶ� ����
	
		switch(s) { 
			case "+":
				result=a+b;
				break;
			case "-":
				result=a-b;
				break;
			case "*":
				result=a*b;
				break;
			case "/":
				if(b==0) //������ �� ��, 2��°�� �Է��ϴ� ���� 0�� ��
					System.out.println("0���� ���� �� �����ϴ�.");
				else
					result=a/b;
				break;
			default:
				System.out.println("�����ڴ� +, -, *, / �ܿ� �Է��� �� �����ϴ�."); //����ó��
		}
		
		if(s.equals("+")||s.equals("-")||s.equals("*")||(s.equals("/")&& b !=0)) //+, -, *, /(0���� ������ ���� ���) �� ������ ��쿡�� �Ʒ� ��� ���
			System.out.println(a+s+b+"�� ��� ����� "+result);
		
		scanner.close(); //Scanner ��ü �� �����Ƿ� �ݳ�
		
	}//end main

}//end class
