package cn.zucc.day04.jiekouHomework;

import java.util.Scanner;

public class  UserDoorIme implements UserDoor {

	
	Scanner sc=new Scanner(System.in);
	
	@Override
	public String addCode() {
		// TODO Auto-generated method stub
		System.out.println("���������룺");
		String name=sc.next();
		
		
		return null;
	}




	

	@Override
	public String addName() {
		// TODO Auto-generated method stub
		System.out.println("������������");
		String name=sc.next();
		return null;
	}

	@Override
	public String addSex() {
		// TODO Auto-generated method stub
		System.out.println("�������Ա�");
		String sex=sc.next();
		return null;
	}

	@Override
	public UserDoor findName() {
		// TODO Auto-generated method stub
		return null;
	}

   public void show(){
	   
	   System.out.println("������"+addName());
	   System.out.println("���룺"+addCode());
	   System.out.println("�Ա�"+addSex());
	   
	   
   }

	
	
	
	
	
	
}
