//8번 
import java.util.Scanner;

public class MeetRec {
	
	//meetRec() : 사용자가 입력한 좌표가 (100, 100)과 (200, 200)이 만드는 직사각형과 만나는지 판별해주는 메서드
	public static boolean meetRec(int recx, int recy, int x1, int y1, int x2, int y2) {
		// 매개변수 x, y는 사용자가 입력한 좌표가 되고 x1, y1 x2, y2에는 (100, 100)과  (200, 200)이 들어감
		if((recx >= x1 && recx <= x2)&&(recy >= y1 && recx <= x2))
			return true;
		else
			return false;
	}//end meetRec()
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("직사각형을 구성하는 두 좌표를 입력");
		System.out.println("첫 번째 좌표 (x1, y1) 입력 :");
		int recx1 = scanner.nextInt();
		int recy1 = scanner.nextInt();
		System.out.println("첫 번째 좌표 (x1, y1) 입력 :");
		int recx2 = scanner.nextInt();
		int recy2 = scanner.nextInt();
		
		boolean result1 = meetRec(recx1, recy1, 100, 100, 200, 200); 
		// 사용자가 입력한 첫 번째 좌표가 (100, 100)과 (200, 200)이 만드는 직사각형과 만날경우 true 반환
		boolean result2 = meetRec(recx2, recy2, 100, 100, 200, 200);
		// 사용자가 입력한 두 번째 좌표가 (100, 100)과 (200, 200)이 만드는 직사각형과 만날경우 true 반환
		
		if(result1==true || result2 ==true) { //사용자가 입력한 두 좌표 중 하나라도 (100, 100)과 (200,200)이 만드는 직사각형과 만난다면
			System.out.println("입력한 두 좌표가 만드는 직사각형은 (100, 100)과 (200, 200)이 만드는 직사각형과 충돌합니다.");
		}else{
			System.out.println("입력한 두 좌표가 만드는 직사각형은 (100, 100)과 (200, 200)이 만드는 직사각형과 충돌하지 않습니다.");
		}
		
		scanner.close();
		
	}//end main

}//end class