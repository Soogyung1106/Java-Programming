/* Ch3 12��
 * ����� ���� �߿��� �������� ��� ���� ���϶�.
 */
public class Add {

	public static void main(String[] args) {
		int sum = 0; // ����ڰ� �Է��� ����� ���ڵ��� ���ؼ� ������ ����
		
		for(int i=0;i<args.length;i++) { //���� ������ŭ �ݺ�
			try {
				int n = Integer.parseInt(args[i]);
				sum +=n; //���ڿ��� ������ ��ȯ�Ͽ� �ջ�
			}catch(NumberFormatException e){ //���ܰ� �߻��� ��� -> ����
				//aa ���� ���ڿ��� ������ ��ȯ�� �� NumberFormatException �߻�
				//�� ���� ��ó -> �׳� �Ѿ��.
			}
		}
		
		System.out.println(sum); 
		
	}

}
