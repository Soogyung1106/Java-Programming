package Homework;

public class Circle implements Shape {

	//필드
	private int x;
	
	//생성자
	Circle(int x){
		this.x = x;
	}
	
	@Override
	public void draw() { //도형을 그리는 추상 메소드 구현
		System.out.println("반지름이 "+this.x+"인 원입니다.");
	}

	@Override
	public double getArea() { //도형의 면적을 리턴하는 추상 메소드 구현
		double area; //넓이를 나타내는 변수
		area = PI*x*x; //원의 넓이 구하는 공식
		return area;
	}

}
