import java.util.Scanner;

/*
 * 사용자로부터 입력받은 수 만큼 1~100 사이의 중복되지 않은 난수 삽입
 */
public class RandomInteger {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("정수 몇개?");
		int n=scanner.nextInt();
		int []randArray = new int [n]; //사용자가 입력한 개수만큼의 일차원 배열 생성
	
		for(int i=0;i<n;i++) { //생성한 난수 개수 n번만큼 루프 반복 
			int rand=(int)(Math.random()*100+1);  //rand에 [1~100] 사이의 랜덤수 생성
			
			int j=0;
			
			//(1) 중복된 난수가 생성되었는지 바로 검사
			for( j=0;j<i;j++) {   //방금 생성한 랜덤수와 배열의 요소들 하나하나 비교
				if(randArray[j]==rand) { //배열에 삽입한 랜덤수와 중복된 게 있을 경우
					i--; //인덱스 한개 감소시킴으로써 하나 증감되도 인덱스 그 자리에 있도록
					break; //배열에 삽입안 하고 break
				}
			}
			
			//(2) 0번째 인덱스 난수 삽입시, (j-1)번째 인덱스까지 살펴본 결과 중복된게 없을 경우 삽입
			if(i==j) //<참고>j는 지역변수로 위에서 선언해 주었으므로 for문의 j의 상태를 그대로 갖고온다.
				randArray[i]=rand;
			
		}//end for2
		
		//(3) 배열의 요소들 출력하기
		for(int i=0;i<randArray.length;i++) {
			
			if(i%10==0)  //10개씩 랜덤수들을 끊어서 '개행'할 목적
				System.out.println();
			System.out.print(randArray[i]+" ");
		}
		scanner.close();
	}//end main

}//end class
