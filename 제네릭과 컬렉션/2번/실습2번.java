package Homework;

import java.util.*;

public class RandomNumber {

	public static void main(String[] args) {
		HashSet <Integer> hSet = new HashSet<Integer>();
		
		for(int x=0;x<6;x++) {
			int n=(int)(Math.random()*45+1); // n은 [1~45] 사이의 랜덤 정수
			System.out.println("random number : "+ n);
			Integer m=Integer.valueOf(n);
			
			if(x!=0 && hSet.equals(m))
				x--;
			else
				hSet.add(new Integer(n));
		}
		
		Iterator<Integer> it = hSet.iterator();
		while(it.hasNext()) {
			int n=it.next();
			System.out.print(n+" ");
		}


	}

}
