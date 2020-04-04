package Homework;

import java.util.*;

public class StackAndQueue {
	
	//���ڿ� "0", "1", "2", "3" ���������� ����
	public static void main(String[] args) {
		
		//(Point1)GStack <T> ���׸� �޼ҵ带 ���� ���� ���� 
		
		System.out.println("= Stack ="); //���Լ���(�ڽ� ����)
		
		GStack <String> stringStack = new GStack<String>();
		stringStack.push("0");
		stringStack.push("1");
		stringStack.push("2");
		stringStack.push("3");
		
		for(int n=0;n<4;n++)
			System.out.println(stringStack.pop());
		
		//(Point2) 
		System.out.println("= Queue ="); //���Լ���(������ ����)
		LinkedList <String> stringQueue = new LinkedList <String> ();
		stringQueue.add("0");
		stringQueue.add("1");
		stringQueue.add("2");
		stringQueue.add("3");
		
		Collections.sort(stringQueue); //��� ����
		Queue.printList(stringQueue); //���ĵ� ��� ���
		
	}

}
