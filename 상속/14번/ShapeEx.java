package Homework;

public class ShapeEx {

	public static void main(String[] args) {
		//��ü �迭 ���� 
		Shape [] list = new Shape[3]; //Shape�� ��ӹ��� Ŭ���� ��ü�� ���۷��� ����
		list[0] = new Circle(10); //�������� 10�� �� ��ü
		list[1] = new Oval(20, 30); //20X30 �簢���� �����ϴ� Ÿ��
		list[2] = new Rect(10, 40); //10X40 ũ���� �簢��
		
		//���
		for(int i=0;i<list.length;i++)
			list[i].redraw(); //list[0].redraw(), list[1].redraw(), list[2].redraw() ȣ��
		for(int i=0;i<list.length;i++)
			System.out.println("������ "+list[i].getArea());
		
		//<��°��>
		//--- �ٽ� �׸��ϴ�. �������� 10�� ���Դϴ�.
		//--- �ٽ� �׸��ϴ�. 20x30�� �����ϴ� Ÿ���Դϴ�.
		//--- �ٽ� �׸��ϴ�. 10x40ũ���� �簢�� �Դϴ�.
		//������ 314.0
		//������ 1884.00...002
		//������ 400.0
		
	}

}
