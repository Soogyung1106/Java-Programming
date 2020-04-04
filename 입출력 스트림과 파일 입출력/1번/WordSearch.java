import java.io.*; //����� Ŭ���� ����ϱ� ���� ��Ű�� ����Ʈ
import java.util.*; //��ĳ�� Ŭ������ �÷��� Ŭ���� ����ϱ� ���� ��Ű�� ����Ʈ

//����!! words.txt ������ ������ ��ġ : c����̺��� Temp ���丮

/* <����1 : �ذ��ؾ� �� ��>
 * ������ ã�� ���� ��,
 * �迭�� �����ϰ�,
 * �迭���� ����ڰ� �Է��� �ܾ�� �����ϴ� �ܾ� ã��  
*/

public class WordSearch {
	
	//�÷��� Ŭ����(ArrayList)�� ��ü ���� : ���Ͽ��� ���� �����͸� ������ �迭
	ArrayList <String> wordArray = new ArrayList<String>(); //ArrayList ����
	
	//���1 : readFile() ������ �д� �޼ҵ�
	private void readFile() {
		FileInputStream fin = null;
		
		try {
			
			//<1�ܰ�> �б� ���� ����Ʈ ��Ʈ�� ���� �� ���� ã�� ����
			fin = new FileInputStream("c:\\Temp\\words.txt"); //������ �ִ� ��ġ : c����̺��� Temp ���丮
			/*FileInputStream Ŭ������ ����ϴ� ���� : 
			  �б� ���� ����Ʈ ��Ʈ��(�ؽ�Ʈ, ���̳ʸ� ���� ��� ���� ����)   
			*/
			
			Scanner fileScanner = new Scanner(fin);
			//��ĳ�� Ŭ������ ������ ��ü�� �ְ� �о���̰� ��.
			
			
			while(fileScanner.hasNext()) { //�� ������ ���� ���� ���������� true ��ȯ
			
				//<2�ܰ�> ���Ͽ��� ���� ���� arrayList <String> �迭�� �� �پ� �����ϱ� 
				wordArray.add(fileScanner.nextLine());  
				/*(����) 
				�� �� �� �� �ܾ ����Ǿ� �����Ƿ� Scanner Ŭ������ nextLine() �޼ҵ� ���
				\n�� �����ϴ� �� ������ �а� \n�� ������ ������ ���ڿ� ����
				*/
			}
			
			fileScanner.close(); //��ĳ�� ��ü �ݳ�
			
		}
		catch(IOException e) {
			System.out.println("words.txt ���� �д� �� ���� �߻�");
		}
	}
	
	//���2 : wordQuery() �ܾ� �˻��� �����ϴ� �޼ҵ�
	private void wordQuery() {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			
			//�˻��� �ܾ� �Է�
			System.out.print("�ܾ�>> ");
			String findword = scanner.nextLine(); //����ڰ� �Է½� ������ ����� ���̹Ƿ� 
		
			int n=findword.length(); //n : ����ڰ� �Է��� �ܾ��� ���� -> ���߿� �迭�� ����� �ܾ �� ���̸�ŭ �ڸ��� ����
			int count=0; //count : �ܾ� ã�� ���� ��� �Ǻ��� -> �迭�� ������ �� ���Ҵµ� ����ڰ� �Է��� �ܾ ã�� ���� ��� count�� �״�� 0 ���� 
			
			//<3�ܰ�> arrayList �迭���� �ܾ� �˻� (wordArray)
			for(int i=0;i<wordArray.size();i++) { //�迭�� ũ�⸸ŭ �ݺ�
				String arrword = wordArray.get(i); //�迭�� ����� �ܾ� �������� -> get(i) �޼ҵ��
				
				//(1)�迭�� ����� �ܾ�� �߿� ����ڰ��Է��� �ܾ�� �ܾ� ���̰� ª�� ���
				if(arrword.length() < n)
					continue; //�˻� ��󿡼� ���ܵǹǷ� i++�� �̵�
				
				//(2)�Է� ���� ���ڿ��� ���̸�ŭ �迭 �ȿ� �ִ� �ܾ���� �ڸ���
				String cutword = arrword.substring(0, n);
				
				if(findword.equals(cutword)) {//���ؼ� ������ 
					System.out.println(arrword); //�ܾ� �տ��� ������ ���
					count++;
				}
				//(3)�迭�� �� ���Ҵµ� ã�� ������ ���
				if(i==wordArray.size()-1 && count==0) //�� ������ �ε����� �� count�� ���°� 0�̶��..
					System.out.println("�߰��� �� �����ϴ�..");
			}
			
			/*<Idea> 
			 * �Է� ���� ���ڿ��� ���̸�ŭ �迭 �ȿ� �ִ� �ܾ���� �߶� �պκ� �� -> String Ŭ������ substring() �޼ҵ� ���
			 * (����� ��) 
			 * -> �迭�� ����� �ܾ�� �߿� ����ڰ��Է��� �ܾ�� �ܾ� ���̰� ª�� ��� : �˻� ��󿡼� ����
			 * -> �迭�� �� ���Ҵµ� ã�� ������ ��� : 
			 */
			
			
			//���� �ݺ��� ��������
			if(findword.equals("exit")) {
				System.out.println("�����մϴ�...");
				break; //while�� ����� ��� �� ������ ������ ��ɹ� �����Ƿ� ���α׷� ������ ����
			}//end if
			
		}//end while
		scanner.close(); //��ĳ�� ��ü �ݳ�
		
	}//end wordQuery()
	
	
	//main
	public static void main(String[] args) {
		//Ŭ������ ��ü ����
		WordSearch ws = new WordSearch(); 
		//�޼ҵ� ȣ���ؼ� ����
		ws.readFile(); //1. words.txt ���� �б�
		ws.wordQuery();//2. �ܾ� �˻��ϱ� 
	}

}
