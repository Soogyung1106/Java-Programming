package Homework;

import java.util.*;

public class Queue {
	static void printList(LinkedList<String> I) {
		Iterator <String> it = I.iterator(); //I�� iterator() ȣ���Ͽ� Iterator ��ü it(�ݺ���) ��
		while(it.hasNext()) { //it���� I�� ������ �ݺ�
			String number = it.next(); //it�� ����Ű�� ���� ��� ����
			System.out.println(number); //���
		}
	}
}
