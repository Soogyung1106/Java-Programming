//8�� 
import java.util.Scanner;

public class MeetRec {
	
	//meetRec() : ����ڰ� �Է��� ��ǥ�� (100, 100)�� (200, 200)�� ����� ���簢���� �������� �Ǻ����ִ� �޼���
	public static boolean meetRec(int recx, int recy, int x1, int y1, int x2, int y2) {
		// �Ű����� x, y�� ����ڰ� �Է��� ��ǥ�� �ǰ� x1, y1 x2, y2���� (100, 100)��  (200, 200)�� ��
		if((recx >= x1 && recx <= x2)&&(recy >= y1 && recx <= x2))
			return true;
		else
			return false;
	}//end meetRec()
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("���簢���� �����ϴ� �� ��ǥ�� �Է�");
		System.out.println("ù ��° ��ǥ (x1, y1) �Է� :");
		int recx1 = scanner.nextInt();
		int recy1 = scanner.nextInt();
		System.out.println("ù ��° ��ǥ (x1, y1) �Է� :");
		int recx2 = scanner.nextInt();
		int recy2 = scanner.nextInt();
		
		boolean result1 = meetRec(recx1, recy1, 100, 100, 200, 200); 
		// ����ڰ� �Է��� ù ��° ��ǥ�� (100, 100)�� (200, 200)�� ����� ���簢���� ������� true ��ȯ
		boolean result2 = meetRec(recx2, recy2, 100, 100, 200, 200);
		// ����ڰ� �Է��� �� ��° ��ǥ�� (100, 100)�� (200, 200)�� ����� ���簢���� ������� true ��ȯ
		
		if(result1==true || result2 ==true) { //����ڰ� �Է��� �� ��ǥ �� �ϳ��� (100, 100)�� (200,200)�� ����� ���簢���� �����ٸ�
			System.out.println("�Է��� �� ��ǥ�� ����� ���簢���� (100, 100)�� (200, 200)�� ����� ���簢���� �浹�մϴ�.");
		}else{
			System.out.println("�Է��� �� ��ǥ�� ����� ���簢���� (100, 100)�� (200, 200)�� ����� ���簢���� �浹���� �ʽ��ϴ�.");
		}
		
		scanner.close();
		
	}//end main

}//end class