package Submit;

public class Phone{
	
   //�ʵ�
   String name; //�̸�
   String tel; //��ȭ��ȣ
   
   //������
   public Phone(String name, String tel){//name�� tel�� �Ű������� �ϴ� Phone ������ �ۼ�
      this.name = name;//
      this.tel = tel;
   }
   
   //�޼ҵ�
   String getName(){
      return name;
   }
   String getTel(){
      return tel;
   }
}