package Homework;

public class Dictionary {
	
	//�ʵ�
	private static String [] kor = {"���", "�Ʊ�", "��", "�̷�", "���"};
	private static String [] eng = {"love", "baby", "money", "future", "hope"};
	
	//�޼ҵ�
	public static String kor2Eng(String word) {
		String s=null;
		
		//����ڰ� �Է��� �ѱ۴ܾ �迭�� �ִ��� �˻�
		for(int i=0;i<5;i++) {
			
			//(1) �ѱ۴ܾ �迭�� ���� ��� �׿� �����Ǵ� ���
			if(word.equals(kor[i])){ // ���ڿ�.equals(���ڿ�)
				s= word+"�� "+eng[i];
				break;
			}
			//(2) �ѱ۴ܾ �迭�� ���� ���
			else {//!(name.equls(person[i].name)
				if(i==4)
					s= word+"�� ���� ������ �����ϴ�.";
			}	
		}//end for	
		
		return s;
	}
	
}
