import java.io.*; //���� �����, 
import java.util.*;

//����!! p2-sample.txt�� ��ġ : c����̺��� Temp ���丮�� ��ġ
/*<����2 : �ذ��ؾ� �� ��>
 * ���Ͽ��� �� �پ� �Է� �޾�  
 * �迭�� ���� ��,
 * ������� ��� -> ArrayList �÷��� Ŭ���� ���
 * �������� ��� -> LinkedList �÷��� Ŭ���� ����ؼ� ����(push, pop) ����
 */

//Fifo : ������� ����ϱ� ���� Ŭ����
public class Fifo {
	
	//�÷��� Ŭ����(ArrayList)�� ��ü ���� : ���Ͽ��� ���� �����͸� ������ fifo ��¿� �迭
	static ArrayList <String> wordArray = new ArrayList<String>(); //ArrayList ����
	
	//���1 : readFile() ������ �д� �޼ҵ�
	private void readFile() {
		FileInputStream fin = null;
		
		try {
			
			//<1�ܰ�> �б� ���� ����Ʈ ��Ʈ�� ���� �� ���� ã�� ����
			fin = new FileInputStream("c:\\Temp\\p2-sample.txt"); //������ �ִ� ��ġ : c����̺��� Temp ���丮
			/*FileInputStream Ŭ������ ����ϴ� ���� : 
			  �б� ���� ����Ʈ ��Ʈ��(�ؽ�Ʈ, ���̳ʸ� ���� ��� ���� ����)   
			*/
			
			Scanner fileScanner = new Scanner(fin);
			//��ĳ�� Ŭ������ ������ ��ü�� �ְ� �о���̰� ��.
			/*Scanner Ŭ������ ����ϴ� ���� : */
			
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
			System.out.println("p2-sample.txt ���� �д� �� ���� �߻�");
		}
	}
	
	//���2 : fifo() ���Ͽ� �ִ� ������� ����ϴ� �޼ҵ�
	private void fifoPrint() {
		for(int i=0;i<wordArray.size();i++) {
			System.out.println(wordArray.get(i)); //�迭�� ����� �ܾ� �������� -> get(i) �޼ҵ��
		}
	}
	
	
	//main
	public static void main(String[] args) {
		
		//��ü ����
		Fifo fifo = new Fifo(); 
		
		fifo.readFile(); //1. ���� �б�
		fifo.fifoPrint(); //2. ���Ͽ� �ִ� ������� ���(fifo)
		
		//��ü ����
		Lifo lifo = new Lifo();
		lifo.lifoPrint();
		//3. ���Ͽ� ����Ǿ� �ִ� �������� ���(lifo)
	}

}

//Lifo : �������� ����ϱ� ���� Ŭ���� 
class Lifo {
	
	int index=0;
	LinkedList <String> wordLinked = new LinkedList<String> ();
	/*LinkedList�� ��ü ���� : ���Ͽ��� ���� �����͸� ������ lifo ��¿� �迭
	  -> ���ÿ� ���ÿ� ��Ҹ� ������ ���� �迭�� ��� 
	*/
	
	//(1) ������ push() ����
	public void push() {
		
		for(int j=0;j<Fifo.wordArray.size();j++) {
			wordLinked.add(Fifo.wordArray.get(j));
			index++;
		}
	}
	
	//(2) ������ pop() ����
	public void pop() {
		
		while(true) {
			index--; //index ���� ���´� �迭�� �� �����̴�. �ڿ��� �迭�� �� �� ��Ҹ� ����ϸ� ����-1�̹Ƿ� �ϳ� ����  
			System.out.println(wordLinked.get(index)); 
			if(index==0) //
				break;
		}	
	}
	
	//ȭ�鿡 ��� <- �޼ҵ� �������  push �״��� pop..
	public void lifoPrint() {
		push();
		pop();
	}
}
