package Homework;

public class GStack <T>{ //���׸� ���� ����. 
	int tos;
	Object [] stck;	//���ÿ� ��Ҹ� ������ ���� �迭
	
	public GStack() {
		tos =0;
		stck = new Object[10];
	}
	
	//���Խ�Ű��
	public void push(T item) {
		if(tos==10) //������ �� ���� �� �̻� ��Ҹ� ������ �� ����
			return;
		stck[tos] = item;
		tos++;
	}
	
	//���ÿ��� ������ 
	public T pop() {
		if(tos==0) //������ ��� �־� ���� ��Ұ� ����
			return null;
		tos--;
		return (T)stck[tos]; //Ÿ�� �Ű����� Ÿ������ ĳ���� 
	}
}