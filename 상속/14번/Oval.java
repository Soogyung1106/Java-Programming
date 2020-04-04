package Homework;

public class Oval implements Shape {

	//필드
	private int x;
	private int y;
	
	//생성자
	Oval(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	@Override
	public void draw() { //도형을 그리는 추상 메소드 구현
		System.out.println(this.x+"x"+this.y+"에 내접하는 타원입니다.");
	}

	@Override
	public double getArea() { //도형의 면적을 리턴하는 추상 메소드 구현
		double area;
		area = PI * this.x * this.y; 
		//타원의 면적을 구하는 공식: PI x 긴 반지름 x 짧은 반지름
		return area;
	}

}
