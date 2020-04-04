public class Point {
	//부모클래스의 필드
	int x, y = 0;
	
	//(기본)생성자
	Point(){ }
	
	//메소드
	public void move(int x, int y) {
		
		if(x<0 && y>0) //(-5, 5)인 경우 아무 처리x 
		
		if(x<0 && y<0) { //(-10, -10)인 경우 슈퍼 클래스의 x=0, y=0으로 초기화
			x=this.x;
			y=this.y;

		}
	}
}
