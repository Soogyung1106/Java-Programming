import java.util.Scanner;

/*
 * ����ڷκ��� �Է¹��� �� ��ŭ 1~100 ������ �ߺ����� ���� ���� ����
 */
public class RandomInteger {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("���� �?");
		int n=scanner.nextInt();
		int []randArray = new int [n]; //����ڰ� �Է��� ������ŭ�� ������ �迭 ����
	
		for(int i=0;i<n;i++) { //������ ���� ���� n����ŭ ���� �ݺ� 
			int rand=(int)(Math.random()*100+1);  //rand�� [1~100] ������ ������ ����
			
			int j=0;
			
			//(1) �ߺ��� ������ �����Ǿ����� �ٷ� �˻�
			for( j=0;j<i;j++) {   //��� ������ �������� �迭�� ��ҵ� �ϳ��ϳ� ��
				if(randArray[j]==rand) { //�迭�� ������ �������� �ߺ��� �� ���� ���
					i--; //�ε��� �Ѱ� ���ҽ�Ŵ���ν� �ϳ� �����ǵ� �ε��� �� �ڸ��� �ֵ���
					break; //�迭�� ���Ծ� �ϰ� break
				}
			}
			
			//(2) 0��° �ε��� ���� ���Խ�, (j-1)��° �ε������� ���캻 ��� �ߺ��Ȱ� ���� ��� ����
			if(i==j) //<����>j�� ���������� ������ ������ �־����Ƿ� for���� j�� ���¸� �״�� ����´�.
				randArray[i]=rand;
			
		}//end for2
		
		//(3) �迭�� ��ҵ� ����ϱ�
		for(int i=0;i<randArray.length;i++) {
			
			if(i%10==0)  //10���� ���������� ��� '����'�� ����
				System.out.println();
			System.out.print(randArray[i]+" ");
		}
		scanner.close();
	}//end main

}//end class
