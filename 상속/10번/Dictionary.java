package Homework;

public class Dictionary extends PairMap { //Dictionary는 추상 클래스 상속받아서 '구현'
	
	//필드
	private int index=0; 
	private int length=0; //length() 메소드로 반환한 값을 저장할 변수
//index는 현재 배열의 인덱스 위치 표기 동시에 배열에 원소 추가할 때마다 인덱스 어디까지 저장했는지 기억하는 역할
	
	//생성자
	Dictionary(int x){
		//키와 값의 쌍을 저장할 수 있는 최대 개수 
		//keyArray[]와 valueArray[]의 길이 지정
		super.keyArray = new String [x];
		super.valueArray = new String [x];
	}
	
	//추상 메소드 오버라이딩
	String get(String key) { //key 값을 가진 value 리턴. 없으면 null 리턴
		
		int i=0;
		String s=null;
		length = length(); //현재 저장된 아이템 개수 저장
		
		for(i=0;i<length;i++) {
			if(keyArray[i]==key) { //key 값이 존재하고...
				if(valueArray[i] != null) { //(1) 그 값도 존재하는 경우 
					s= valueArray[i];
					break;
				}
				else { //(2) 그 값이 존재하지 않는 경우 
					s=null;
					break;
				}
			}	
		}//end for
		
		return s;	
	}
	
	void put(String key, String value) {
	//key와 value를 쌍으로 저장. 기존에 key가 있으면, 값을 value로 저장.
		
		//flag : 기존 배열에 입력한 key 값이 있는지의 여부를 판단하는 지표가 되는 변수  
		int flag=0;
		length = length(); //현재 저장된 아이템 개수 저장
		
		//(1) index == 0 인 경우(즉, 처음으로 배열에 원소를 추가할 경우)
		if(index==0) {
			keyArray[index]=key;
			valueArray[index]=value;
			index++;  //다음에 추가할 원소를 위해 인덱스 하나 증가시켜 놓기
			//"배열에 저장한 원소의 개수 1개 증가했다." 의 의미
		}
		
		//(2) 배열에 원소를 추가하는 것이 처음이 아닌 경우
		if(index !=0) {
			//(2)-a 기존에 동일한 key가 있는지 검사
			for(int i=0;i<length;i++) {
				if(keyArray[i]==key) { //기존에 key가 있을 경우, 값을 value로 저장
					flag = 1; // 배열에 똑같은 값이 이미 존재한다는 표시
					index--; //하나 증가시킨 인덱스는 제자리로 -> 값만 변경할 것이기 때문에
					valueArray[index]=value;
					index++;  //다음에 추가할 원소를 위해 인덱스 하나 증가시켜 놓기
					break;
				}
			}
			//(2)-b 기존에 새로운 key인 경우
			if(flag == 0) { //배열에 똑같은 값이 존재하지 않을 경우 flag=0인 상태로 그대로임.
				keyArray[index]=key;
				valueArray[index]=value;
				index++;  //다음에 추가할 원소를 위해 인덱스 하나 증가시켜 놓기
				//"배열에 저장한 원소의 개수 1개 증가했다." 의 의미
			}
				
		}//end if
	}
	
	String delete(String key) {
	//key값을 가진 아이템(value와 함께) 삭제. 삭제된 value 값 리턴
		
		int i=0;
		length = length(); //현재 저장된 아이템 개수 저장
		
		for(i=0;i<length;i++) {
			if(keyArray[i]==key) { //기존에 key가 있을 경우, 값을 삭제.
				valueArray[i]=null;  
				break;
			}	
		}//end for
		
		return valueArray[i]; //삭제된 value 값 리턴
	}
	
	int length() {
		//현재 저장된 아이템의 개수 리턴
		return index+1; //인덱스는 배열에서 따지므로 실제 저장된 개수는 인덱스에 1을 더해야.
	}

}
