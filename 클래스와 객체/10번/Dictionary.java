package Homework;

public class Dictionary {
	
	//필드
	private static String [] kor = {"사랑", "아기", "돈", "미래", "희망"};
	private static String [] eng = {"love", "baby", "money", "future", "hope"};
	
	//메소드
	public static String kor2Eng(String word) {
		String s=null;
		
		//사용자가 입력한 한글단어가 배열에 있는지 검사
		for(int i=0;i<5;i++) {
			
			//(1) 한글단어가 배열에 있을 경우 그에 대응되는 경우
			if(word.equals(kor[i])){ // 문자열.equals(문자열)
				s= word+"은 "+eng[i];
				break;
			}
			//(2) 한글단어가 배열에 없는 경우
			else {//!(name.equls(person[i].name)
				if(i==4)
					s= word+"는 저의 사전에 없습니다.";
			}	
		}//end for	
		
		return s;
	}
	
}
