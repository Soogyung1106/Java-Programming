package Homework;

public class Circle implements Shape {

	//�ʵ�
	private int x;
	
	//������
	Circle(int x){
		this.x = x;
	}
	
	@Override
	public void draw() { //������ �׸��� �߻� �޼ҵ� ����
		System.out.println("�������� "+this.x+"�� ���Դϴ�.");
	}

	@Override
	public double getArea() { //������ ������ �����ϴ� �߻� �޼ҵ� ����
		double area; //���̸� ��Ÿ���� ����
		area = PI*x*x; //���� ���� ���ϴ� ����
		return area;
	}

}
