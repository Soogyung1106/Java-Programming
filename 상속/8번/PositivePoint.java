//PositivePoint -> ����� ���������� ���� ��Ÿ��
public class PositivePoint extends Point {

	//�ڽ� Ŭ������ �ʵ�
	int x, y;
	
	//������
	PositivePoint(){ } //�⺻ ������
		
	PositivePoint(int x, int y){
		super(); //����� ���� Ŭ������ �����ڷ� �⺻ ������ ����
		
		if(x>0 && y<0) // (-10, -10)�� ���
			super.move(x, y); // ���� Ŭ������ move ȣ�� 	
	}
		
	//�������̵�
	public void move(int x, int y) { //����� ���������� ���� ��Ÿ������
		if(x>0 && y>0) {
			this.x=x;
			this.y=y;
		}
		else //x�� y ���� ����� ������ ���� ���� ��� ���� Ŭ������ move ȣ�� 
			super.move(x, y); 	
	}
		
	//�߰� �޼ҵ��� ���ÿ� �������̵��� �޼ҵ�(<- Object Ŭ������ toString �Լ�)
	public String toString() {
		return "("+x+","+y+")"+"�� ��";
	}	
	

}
