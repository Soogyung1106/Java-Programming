package Homework;

import java.util.*;

public class Queue {
	static void printList(LinkedList<String> I) {
		Iterator <String> it = I.iterator(); //I의 iterator() 호출하여 Iterator 객체 it(반복자) 얻어냄
		while(it.hasNext()) { //it으로 I의 끝까지 반복
			String number = it.next(); //it이 가리키는 다음 요소 리턴
			System.out.println(number); //출력
		}
	}
}
