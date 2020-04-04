package Submit;

public class Phone{
	
   //필드
   String name; //이름
   String tel; //전화번호
   
   //생성자
   public Phone(String name, String tel){//name과 tel을 매개변수로 하는 Phone 생성자 작성
      this.name = name;//
      this.tel = tel;
   }
   
   //메소드
   String getName(){
      return name;
   }
   String getTel(){
      return tel;
   }
}