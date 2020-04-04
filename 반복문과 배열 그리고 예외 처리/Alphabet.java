import java.util.Scanner;

/*
 * 소문자 알파벳을 하나 입력받고 차례로 출력하는 프로그램
 */
public class Alphabet {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("소문자 알파벳 하나를 입력하시오>");
		String s=scanner.next();
		char alpha=s.charAt(0); //charAt(0) : 입력한 문자열 중에 첫 글자만 뽑아내는 기능 
		
		/*<규칙> 각 행 i와 끝에 오는 글자를 합하면 입력한 수 (int)alpha와 a(97)을 더한수 temp이다.
		a = 97

		만약에 d(100)를 입력한다면

		1행(97) -> 97~100      abcd 
		2행(98) -> 97~99       abc
		3행(99) -> 97~98       ab
		4행(100) -> 100 97~97  a
		
		*/
		
		int temp = (int)('a'+alpha); 
		//아스키코드표를 참고해 보면 소문자 a는 97과 대응됨!
		for(int i=97; i<=(int)alpha ;i++) { //행의 갯수
			for(int j=97; j<=temp-i;j++) { 
				//<규칙> 행이 변함에 따라 각 행에 오는 갯수는 a(97)과 (int)alpha에서 i(행)를 뺀 갯수만큼 옴 
				System.out.print((char)j);  //강제형변환을 통해 출력될때는 알파벳으로 출력되도록!
			}
			
			System.out.println(); //한 행을 출력하고 나서는 개행 
		}
		
		scanner.close();

	}

}