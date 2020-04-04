package Homework;

public class GStack <T>{ //제네릭 스택 선언. 
	int tos;
	Object [] stck;	//스택에 요소를 저장할 공간 배열
	
	public GStack() {
		tos =0;
		stck = new Object[10];
	}
	
	//삽입시키기
	public void push(T item) {
		if(tos==10) //스택이 꽉 차서 더 이상 요소를 삽입할 수 없음
			return;
		stck[tos] = item;
		tos++;
	}
	
	//스택에서 꺼내기 
	public T pop() {
		if(tos==0) //스택이 비어 있어 꺼낼 요소가 없음
			return null;
		tos--;
		return (T)stck[tos]; //타입 매개변수 타입으로 캐스팅 
	}
}