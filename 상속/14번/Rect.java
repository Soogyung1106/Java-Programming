package Homework;

public class Rect implements Shape {

	//필드
	private int x;
	private int y;
	
	//생성자
	Rect(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	@Override
	public void draw() { //도형을 그리는 추상 메소드 구현
		System.out.println(this.x+"x"+this.y+"크기의 사각형 입니다.");
	}

	@Override
	public double getArea() { //도형의 면적을 리턴하는 추상 메소드 구현
		double area;
		area = this.x * this.y; //사각형 넓이 구하는 공식
		return area;
	}

}
