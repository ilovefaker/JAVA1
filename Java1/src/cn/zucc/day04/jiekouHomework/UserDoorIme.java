package cn.zucc.day04.jiekouHomework;

import java.util.Scanner;

public class  UserDoorIme implements UserDoor {

	
	Scanner sc=new Scanner(System.in);
	
	@Override
	public String addCode() {
		// TODO Auto-generated method stub
		System.out.println("请输入密码：");
		String name=sc.next();
		
		
		return null;
	}




	

	@Override
	public String addName() {
		// TODO Auto-generated method stub
		System.out.println("请输入姓名：");
		String name=sc.next();
		return null;
	}

	@Override
	public String addSex() {
		// TODO Auto-generated method stub
		System.out.println("请输入性别：");
		String sex=sc.next();
		return null;
	}

	@Override
	public UserDoor findName() {
		// TODO Auto-generated method stub
		return null;
	}

   public void show(){
	   
	   System.out.println("姓名："+addName());
	   System.out.println("密码："+addCode());
	   System.out.println("性别："+addSex());
	   
	   
   }

	
	
	
	
	
	
}
