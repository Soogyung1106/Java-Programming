import java.io.*; // BufferedReader, FileReader, IOException Ŭ���� ����
import java.util.StringTokenizer;
//<�ذ��ؾ� �� ��>
//points.txt ������ ã�Ƽ� �о�� - 1-(1)
//�� �� ������ ��ǥ�� move.txt�� ���� - 1-(2)
//������ ��� ������ ���̸� ���ϰ� - (2)
//��� �� ������ �� - (3)
//��� ��� - (4)
public class Point {

	public static void main(String[] args) {
		
		
		double arr[] = new double[9]; //���� �ȿ� �ִ� ��ҵ��� ���� ����� �Ǽ� �迭
		int i=0;  //arr �迭�� �ε����� ǥ���� ����
		
		StringTokenizer st = null;
		
		//1-(1) points.txt ���� ���� ���� �о �迭�� �����ϱ�
		try {
			
			//1�ܰ� : ���� �Է� ��Ʈ�� ����-> ������ �̸� ã�Ƽ� ��Ʈ�� ����
			
			BufferedReader fin = new BufferedReader(new FileReader("c:\\Temp\\points.txt"));
			//2�ܰ� : ������ ���� �о����
			String s;
			
			
			while((s = fin.readLine())!= null) { //�� ���ھ� ���� ������ �б�
				
				st = new StringTokenizer(s, " "); //�о�� ���ڿ����� " "�� �������� ��ū
				while(st.hasMoreTokens()) { //��ū�� �ִ� ����
					arr[i]= Double.parseDouble(st.nextToken()); 
					//���� ��ū(���ڿ�) �����ؼ� �Ǽ��� ����ȯ�� �� �迭�� ���� 
					i++;
				}	
			}
			
			//3�ܰ� : ��Ʈ�� �ݱ�
			fin.close();
		}//end try
		catch(IOException e) {
			System.out.println("����� ����");
		}
		
		//1-(2)
		//points.txt ���Ͽ��� ������ ��ǥ�� move.txt�� ���� 
		
		try {
			PrintWriter out = new PrintWriter("c:\\Temp\\move.txt"); //c:\\Temp\\points.txt ��θ�
			
			for(i=1;i<arr.length;i++) //2��° �ε������� ������ move.txt ���Ͽ� �ۼ� 
				out.print(arr[i]+" "); // �����̽��ٷ� ���ڵ� ����
				
			out.close();
		}catch(IOException e) {
			System.out.println("����� ����");
		}
		
	
		//(2), (3), (4) ������ ��� ������ ���̿� �� �� ���ؼ� ��� ���
		
		double d=0; //���� ����(�� �� ������)
		double sum=0;//���� ������ ����
		int count=0;
		
		/*<for���� ������ ��Ģ ã��>
				double d1=0; //(arr[3]-arr[1])�� ���� + (arr[4]-arr[2])�� ���� ��Ʈ
				double d2=0; //(arr[5]-arr[3])�� ���� + (arr[6]-arr[4])�� ���� ��Ʈ
				double d3=0; //(arr[7]-arr[5])�� ���� + (arr[8]-arr[6])�� ���� ��Ʈ
				
				�� 3���� �� -> j=5 = 3*2-1
				�� 4���� �� -> j=7 = 4*2-1
				�� 5���� �� -> j=9 = 5*2-1
				
				(��Ģ) ���� ����-> j = ���� ���� * 2 -1 
		*/
		
		
		for(int j=1;j<=(arr[0]-1)*2-1;j++) { //���� ���� = ���� ���� -1 
			
			if(j!=1) { 
				j++;
				count++;
				double temp = Math.pow(arr[j+2]-arr[j] ,2)+Math.pow(arr[j+3]-arr[j+1],2); //{(x2-x1)�� ���� + (y2, y1)�� ����}
				d=Math.sqrt(temp); // �� �������� �Ÿ� d = {(x2-x1)�� ���� + (y2, y1)�� ����}�� ��Ʈ
				System.out.println("��"+count+"�� ���� : "+d);
				sum +=d;
			}
			else {//j=1�� ��� ��, �� ó������ �ش�
				count++;
				double temp = Math.pow(arr[j+2]-arr[j] ,2)+Math.pow(arr[j+3]-arr[j+1],2); //{(x2-x1)�� ���� + (y2, y1)�� ����}
				d=Math.sqrt(temp); // �� �������� �Ÿ� d = {(x2-x1)�� ���� + (y2, y1)�� ����}�� ��Ʈ
				System.out.println("��"+count+"�� ���� : "+d);
				sum+=d;//���� ������ ���� �����ؼ� ���ϱ�.
			}
		}
	
		System.out.println("��� ������ ������ ���� : "+sum);
		
	}

}
