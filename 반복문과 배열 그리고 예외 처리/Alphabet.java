import java.util.Scanner;

/*
 * �ҹ��� ���ĺ��� �ϳ� �Է¹ް� ���ʷ� ����ϴ� ���α׷�
 */
public class Alphabet {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("�ҹ��� ���ĺ� �ϳ��� �Է��Ͻÿ�>");
		String s=scanner.next();
		char alpha=s.charAt(0); //charAt(0) : �Է��� ���ڿ� �߿� ù ���ڸ� �̾Ƴ��� ��� 
		
		/*<��Ģ> �� �� i�� ���� ���� ���ڸ� ���ϸ� �Է��� �� (int)alpha�� a(97)�� ���Ѽ� temp�̴�.
		a = 97

		���࿡ d(100)�� �Է��Ѵٸ�

		1��(97) -> 97~100      abcd 
		2��(98) -> 97~99       abc
		3��(99) -> 97~98       ab
		4��(100) -> 100 97~97  a
		
		*/
		
		int temp = (int)('a'+alpha); 
		//�ƽ�Ű�ڵ�ǥ�� ������ ���� �ҹ��� a�� 97�� ������!
		for(int i=97; i<=(int)alpha ;i++) { //���� ����
			for(int j=97; j<=temp-i;j++) { 
				//<��Ģ> ���� ���Կ� ���� �� �࿡ ���� ������ a(97)�� (int)alpha���� i(��)�� �� ������ŭ �� 
				System.out.print((char)j);  //��������ȯ�� ���� ��µɶ��� ���ĺ����� ��µǵ���!
			}
			
			System.out.println(); //�� ���� ����ϰ� ������ ���� 
		}
		
		scanner.close();

	}

}