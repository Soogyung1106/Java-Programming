/* Ch3 12번
 * 명령행 인자 중에서 정수만을 골라 합을 구하라.
 */
public class Add {

	public static void main(String[] args) {
		int sum = 0; // 사용자가 입력한 명령행 인자들을 더해서 저장할 변수
		
		for(int i=0;i<args.length;i++) { //인자 개수만큼 반복
			try {
				int n = Integer.parseInt(args[i]);
				sum +=n; //문자열을 정수로 변환하여 합산
			}catch(NumberFormatException e){ //예외가 발생할 경우 -> 행위
				//aa 같은 문자열을 정수로 변환할 때 NumberFormatException 발생
				//그 때의 대처 -> 그냥 넘어간다.
			}
		}
		
		System.out.println(sum); 
		
	}

}
