package Submit;

import java.util.Scanner;

public class PhoneBook {

	   public static void main(String[] args) {
	      
	      Scanner scanner = new Scanner(System.in);
	      System.out.print("�ο���>>>");
	      int size = scanner.nextInt();
	      
	      //��ü �迭 ���� ����
		  //(1) �迭�� ���� ���۷����� �迭 ����
	      Phone[] person = new Phone[size];
	      // �� ����� ����(�̸��� ��ȣ)�� �ϳ���  Phone ��ü(person[0], person[1]...)�� �����Ѵ�.
	      
	      for(int i=0;i<person.length;i++){  //�迭�� size��ŭ �Է¹ޱ�
	         System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� �� ĭ ���� �Է�)>>");
	         String name = scanner.next();
	         String tel = scanner.next();
	         //(2) ��ü ����
	         person[i] = new Phone(name, tel);
	      }
	      System.out.println("����Ǿ����ϴ�...");
	      
	      loop: 
	      //<����>��ø�ݺ��� Ż���ϱ� ���� loop: �� 
	      //break loop;�� ������ �� �ش� ���� �������� �׿��ִ� �� ���� �ݺ��� �� �� ����� ����
	    	  
	      while(true){//���ѹݺ��� ����
	         System.out.print("�˻����̸�>>");
	         String input = scanner.next();
	         
	         //�Է��� �̸��� ���� ��ȣ ���
		     //(1) for�� ������ �˻��� �̸��� �迭�� �ִ��� ã�ƺ� �� ��ȣ ���
	         
	         for(int i=0;i<size;i++){//size��ŭ �ݺ��ؼ� ���ڿ� ��
	            if(input.equals("�׸�"))
	               break loop;  
	            else if(input.equals(person[i].name)){
	               System.out.println(person[i].getName()+"�� ��ȣ�� "+person[i].getTel()+" �Դϴ�.");//phone�迭�� ���� i���� ��ȣ���
	               //<����> ���ۿ� �̻��� ���� �� ��½� �ܼ�â�� �̻��� ���ڰ� ��µǹǷ�  getName(), getTel() �̿��ϱ�
	               break;
	            }
	          //(2) �̸��� �迭�� ���� ���
	            else { //!(input.equals(person[i].name) 
	               if(i==size-1)
	            	System.out.println(input+" �� �����ϴ�.");
	            }
	         }//end for
	         
	      }//end while
	      
	      scanner.close(); //��ĳ�� ��ü �� ��������Ƿ� �ݳ�
	   }//end main

	}//end class
