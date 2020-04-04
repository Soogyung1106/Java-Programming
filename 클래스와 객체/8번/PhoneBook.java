package Submit;

import java.util.Scanner;

public class PhoneBook {

	   public static void main(String[] args) {
	      
	      Scanner scanner = new Scanner(System.in);
	      System.out.print("인원수>>>");
	      int size = scanner.nextInt();
	      
	      //객체 배열 생성 과정
		  //(1) 배열에 대한 레퍼런스와 배열 생성
	      Phone[] person = new Phone[size];
	      // 한 사람의 정보(이름과 번호)는 하나의  Phone 객체(person[0], person[1]...)에 저장한다.
	      
	      for(int i=0;i<person.length;i++){  //배열의 size만큼 입력받기
	         System.out.print("이름과 전화번호(이름과 번호는 빈 칸 없이 입력)>>");
	         String name = scanner.next();
	         String tel = scanner.next();
	         //(2) 객체 생성
	         person[i] = new Phone(name, tel);
	      }
	      System.out.println("저장되었습니다...");
	      
	      loop: 
	      //<설명>중첩반복문 탈출하기 위한 loop: 라벨 
	      //break loop;를 만났을 때 해당 라벨이 이중으로 쌓여있는 두 개의 반복문 둘 다 벗어나게 해줌
	    	  
	      while(true){//무한반복문 실행
	         System.out.print("검색할이름>>");
	         String input = scanner.next();
	         
	         //입력한 이름에 대한 번호 출력
		     //(1) for문 돌려서 검색한 이름이 배열에 있는지 찾아본 후 번호 출력
	         
	         for(int i=0;i<size;i++){//size만큼 반복해서 문자열 비교
	            if(input.equals("그만"))
	               break loop;  
	            else if(input.equals(person[i].name)){
	               System.out.println(person[i].getName()+"의 번호는 "+person[i].getTel()+" 입니다.");//phone배열의 같은 i값의 번호출력
	               //<오류> 버퍼에 이상한 값이 들어가 출력시 콘솔창에 이상한 문자가 출력되므로  getName(), getTel() 이용하기
	               break;
	            }
	          //(2) 이름이 배열에 없는 경우
	            else { //!(input.equals(person[i].name) 
	               if(i==size-1)
	            	System.out.println(input+" 이 없습니다.");
	            }
	         }//end for
	         
	      }//end while
	      
	      scanner.close(); //스캐너 객체 다 사용했으므로 반납
	   }//end main

	}//end class
