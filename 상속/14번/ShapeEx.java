package Homework;

public class ShapeEx {

	public static void main(String[] args) {
		//객체 배열 개념 
		Shape [] list = new Shape[3]; //Shape을 상속받은 클래스 객체의 레퍼런스 역할
		list[0] = new Circle(10); //반지름이 10인 원 객체
		list[1] = new Oval(20, 30); //20X30 사각형에 내접하는 타원
		list[2] = new Rect(10, 40); //10X40 크기의 사각형
		
		//출력
		for(int i=0;i<list.length;i++)
			list[i].redraw(); //list[0].redraw(), list[1].redraw(), list[2].redraw() 호출
		for(int i=0;i<list.length;i++)
			System.out.println("면적은 "+list[i].getArea());
		
		//<출력결과>
		//--- 다시 그립니다. 반지름이 10인 원입니다.
		//--- 다시 그립니다. 20x30에 내접하는 타원입니다.
		//--- 다시 그립니다. 10x40크기의 사각형 입니다.
		//면적은 314.0
		//면적은 1884.00...002
		//면적은 400.0
		
	}

}
