package Homework;

public class Oval implements Shape {

	//�ʵ�
	private int x;
	private int y;
	
	//������
	Oval(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	@Override
	public void draw() { //������ �׸��� �߻� �޼ҵ� ����
		System.out.println(this.x+"x"+this.y+"�� �����ϴ� Ÿ���Դϴ�.");
	}

	@Override
	public double getArea() { //������ ������ �����ϴ� �߻� �޼ҵ� ����
		double area;
		area = PI * this.x * this.y; 
		//Ÿ���� ������ ���ϴ� ����: PI x �� ������ x ª�� ������
		return area;
	}

}
