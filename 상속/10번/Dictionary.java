package Homework;

public class Dictionary extends PairMap { //Dictionary�� �߻� Ŭ���� ��ӹ޾Ƽ� '����'
	
	//�ʵ�
	private int index=0; 
	private int length=0; //length() �޼ҵ�� ��ȯ�� ���� ������ ����
//index�� ���� �迭�� �ε��� ��ġ ǥ�� ���ÿ� �迭�� ���� �߰��� ������ �ε��� ������ �����ߴ��� ����ϴ� ����
	
	//������
	Dictionary(int x){
		//Ű�� ���� ���� ������ �� �ִ� �ִ� ���� 
		//keyArray[]�� valueArray[]�� ���� ����
		super.keyArray = new String [x];
		super.valueArray = new String [x];
	}
	
	//�߻� �޼ҵ� �������̵�
	String get(String key) { //key ���� ���� value ����. ������ null ����
		
		int i=0;
		String s=null;
		length = length(); //���� ����� ������ ���� ����
		
		for(i=0;i<length;i++) {
			if(keyArray[i]==key) { //key ���� �����ϰ�...
				if(valueArray[i] != null) { //(1) �� ���� �����ϴ� ��� 
					s= valueArray[i];
					break;
				}
				else { //(2) �� ���� �������� �ʴ� ��� 
					s=null;
					break;
				}
			}	
		}//end for
		
		return s;	
	}
	
	void put(String key, String value) {
	//key�� value�� ������ ����. ������ key�� ������, ���� value�� ����.
		
		//flag : ���� �迭�� �Է��� key ���� �ִ����� ���θ� �Ǵ��ϴ� ��ǥ�� �Ǵ� ����  
		int flag=0;
		length = length(); //���� ����� ������ ���� ����
		
		//(1) index == 0 �� ���(��, ó������ �迭�� ���Ҹ� �߰��� ���)
		if(index==0) {
			keyArray[index]=key;
			valueArray[index]=value;
			index++;  //������ �߰��� ���Ҹ� ���� �ε��� �ϳ� �������� ����
			//"�迭�� ������ ������ ���� 1�� �����ߴ�." �� �ǹ�
		}
		
		//(2) �迭�� ���Ҹ� �߰��ϴ� ���� ó���� �ƴ� ���
		if(index !=0) {
			//(2)-a ������ ������ key�� �ִ��� �˻�
			for(int i=0;i<length;i++) {
				if(keyArray[i]==key) { //������ key�� ���� ���, ���� value�� ����
					flag = 1; // �迭�� �Ȱ��� ���� �̹� �����Ѵٴ� ǥ��
					index--; //�ϳ� ������Ų �ε����� ���ڸ��� -> ���� ������ ���̱� ������
					valueArray[index]=value;
					index++;  //������ �߰��� ���Ҹ� ���� �ε��� �ϳ� �������� ����
					break;
				}
			}
			//(2)-b ������ ���ο� key�� ���
			if(flag == 0) { //�迭�� �Ȱ��� ���� �������� ���� ��� flag=0�� ���·� �״����.
				keyArray[index]=key;
				valueArray[index]=value;
				index++;  //������ �߰��� ���Ҹ� ���� �ε��� �ϳ� �������� ����
				//"�迭�� ������ ������ ���� 1�� �����ߴ�." �� �ǹ�
			}
				
		}//end if
	}
	
	String delete(String key) {
	//key���� ���� ������(value�� �Բ�) ����. ������ value �� ����
		
		int i=0;
		length = length(); //���� ����� ������ ���� ����
		
		for(i=0;i<length;i++) {
			if(keyArray[i]==key) { //������ key�� ���� ���, ���� ����.
				valueArray[i]=null;  
				break;
			}	
		}//end for
		
		return valueArray[i]; //������ value �� ����
	}
	
	int length() {
		//���� ����� �������� ���� ����
		return index+1; //�ε����� �迭���� �����Ƿ� ���� ����� ������ �ε����� 1�� ���ؾ�.
	}

}
