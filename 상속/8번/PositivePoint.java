//PositivePoint -> 양수의 공간에서만 점을 나타냄
public class PositivePoint extends Point {

	//자식 클래스의 필드
	int x, y;
	
	//생성자
	PositivePoint(){ } //기본 생성자
		
	PositivePoint(int x, int y){
		super(); //실행시 슈퍼 클래스의 생성자로 기본 생성자 선택
		
		if(x>0 && y<0) // (-10, -10)의 경우
			super.move(x, y); // 슈퍼 클래스의 move 호출 	
	}
		
	//오버라이딩
	public void move(int x, int y) { //양수의 공간에서만 점을 나타내도록
		if(x>0 && y>0) {
			this.x=x;
			this.y=y;
		}
		else //x와 y 점이 양수의 공간에 있지 않을 경우 슈퍼 클래스의 move 호출 
			super.move(x, y); 	
	}
		
	//추가 메소드인 동시에 오버라이딩된 메소드(<- Object 클래스의 toString 함수)
	public String toString() {
		return "("+x+","+y+")"+"의 점";
	}	
	

}
