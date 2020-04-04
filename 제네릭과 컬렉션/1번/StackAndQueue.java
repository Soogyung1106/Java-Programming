package Homework;

import java.util.*;

public class StackAndQueue {
	
	//문자열 "0", "1", "2", "3" 순차적으로 삽입
	public static void main(String[] args) {
		
		//(Point1)GStack <T> 제네릭 메소드를 통해 스택 구현 
		
		System.out.println("= Stack ="); //후입선출(박스 생각)
		
		GStack <String> stringStack = new GStack<String>();
		stringStack.push("0");
		stringStack.push("1");
		stringStack.push("2");
		stringStack.push("3");
		
		for(int n=0;n<4;n++)
			System.out.println(stringStack.pop());
		
		//(Point2) 
		System.out.println("= Queue ="); //선입선출(파이프 생각)
		LinkedList <String> stringQueue = new LinkedList <String> ();
		stringQueue.add("0");
		stringQueue.add("1");
		stringQueue.add("2");
		stringQueue.add("3");
		
		Collections.sort(stringQueue); //요소 정렬
		Queue.printList(stringQueue); //정렬된 요소 출력
		
	}

}
