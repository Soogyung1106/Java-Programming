package Homework;

public class Rect implements Shape {

	//�ʵ�
	private int x;
	private int y;
	
	//������
	Rect(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	@Override
	public void draw() { //������ �׸��� �߻� �޼ҵ� ����
		System.out.println(this.x+"x"+this.y+"ũ���� �簢�� �Դϴ�.");
	}

	@Override
	public double getArea() { //������ ������ �����ϴ� �߻� �޼ҵ� ����
		double area;
		area = this.x * this.y; //�簢�� ���� ���ϴ� ����
		return area;
	}

}
