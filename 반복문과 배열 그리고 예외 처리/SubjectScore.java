import java.util.Scanner;
/* Ch3 14�� ����
 * ����� ������ ¦�� �̷絵�� 2���� �迭�� ������ �� ���� �̸��� �Է¹޾� ������ ����ϰ� "�׸�"�� �Է¹����� �����Ѵ�.
 * */
public class SubjectScore {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String subject[]= {"Java", "C++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�"};
		int score []= {95, 88, 76, 62, 55};
		
		while(true) {
			System.out.print("�����̸�>>");
			String s = scanner.next();
						
			if(s.equals("�׸�")) //���� �ݺ����� �������� ����	
				break; //��ü �ݺ��� ����� -> if���� �ƴ϶�
			
			else {
				
				//for������ ������ �迭�� �� ��ҿ� �Է��� ���ڿ� ���ϱ� 
				for(int i=0;i<subject.length;i++) {
					if(s.equals(subject[i])) {
						System.out.println(subject[i]+"������ "+score[i]);
						break; //for���� ����� break -> �ڿ� �ε����� �� �ʿ� ����
					}
					//<i=4�� ������ ���>
					//(1) s.equals(subject[4])�� ��� i=4�� ���·� for�� �����
					//(2) �ε��� 0���� 4���� �Է��� ���ڿ��� ���� ���� ã�� ���ߴٸ� i = 4���·� ����
					
					else { // !(s.equals(subject[i]))�� ��쿡��
						if(i==4) //�� �߿� i=4�� ���
							System.out.println("���� �����Դϴ�.");			
					}
				}//end for
		
			}//end else
			
		}//end while
		
		scanner.close(); //�� �̻� scanner��ü �� ���Ƿ� �ݳ�
	}//end main
	
}//end class
