public class Point {
	//�θ�Ŭ������ �ʵ�
	int x, y = 0;
	
	//(�⺻)������
	Point(){ }
	
	//�޼ҵ�
	public void move(int x, int y) {
		
		if(x<0 && y>0) //(-5, 5)�� ��� �ƹ� ó��x 
		
		if(x<0 && y<0) { //(-10, -10)�� ��� ���� Ŭ������ x=0, y=0���� �ʱ�ȭ
			x=this.x;
			y=this.y;

		}
	}
}
