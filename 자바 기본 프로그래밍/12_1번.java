//12-(1)�� if-else�� �̿��� �ۼ�

import java.util.Scanner; //Scanner �Լ� ��Ű�� ����
public class Calculator1 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in); //Scanner�� ��ü ����
		System.out.println("�����ڴ� +, - , *, / �� ������ �Ѵ�.");
		System.out.println("����>>");
		double a= scanner.nextDouble(); //ù ��° �ǿ����� �Է�
		String s= scanner.next(); //����ڰ� ���� ������
		double b= scanner.nextDouble(); //�� ��° �ǿ����� �Է�
		
		double result=0; //���� ����� ��Ƶ� ����
	
		if(s.equals("+"))
			result=a+b;
		else if(s.equals("*"))
			result=a*b;
		else if(s.equals("-"))
			result=a-b;
		else if(s.equals("/"))
			if(b==0) //������ �� ��, 2��°�� �Է��ϴ� ���� 0�� ��
				System.out.println("0���� ���� �� �����ϴ�.");
			else
				result=a/b;
		else
			System.out.println("�����ڴ� +, -, *, / �ܿ� �Է��� �� �����ϴ�."); //����ó��
		
		
		if(s.equals("+")||s.equals("-")||s.equals("*")||(s.equals("/")&& b !=0)) //+, *, /(0���� ������ ���� ���) �� ������ ��쿡�� �Ʒ� ��� ���
			System.out.println(a+s+b+"�� ��� ����� "+result);

		scanner.close(); //Scanner ��ü �� �����Ƿ� �ݳ�
		
	}//end main

}//end class
