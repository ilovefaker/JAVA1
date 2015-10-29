package cn.zucc.day022;

import java.util.Scanner;

public class ShopMarket {
    Scanner sc= new Scanner(System.in); 
	public void login(){
		System.out.println("\t欢迎来到我行我素购物系统！");
		System.out.println("\t\t1.登录系统");
		System.out.println("\t\t2.退出");
		System.out.println("\t**********************************************！");
	    System.out.println("请选择：");
		int num=sc.nextInt();
		switch(num){
		case 1:
			MainTop();break;
		case 2:
			System.out.print("谢谢使用~");break;
		default:
			
			System.out.print("你输入有误，请重新输入！");break;
		}
		}
	public void MainTop(){
		
		System.out.println("\t\t1.客户信息管理");
		System.out.println("\t\t2.真情回馈");
		System.out.println("\t**********************************************！");
		System.out.println("请选择，输入数字（输入数字0退出）：");
		System.out.println("请选择：");
		int num=sc.nextInt();
		switch(num){
		case 1:
			MainTop();break;
		case 2:
			feedback();break;
		case 0:
			MainTop();break;
			
			
		default:
			
			System.out.print("你输入有误，请重新输入！");break;
		
		}
		}
	public void feedback(){
		
		System.out.println("\t\t1.幸运大放送");
		System.out.println("\t\t2.幸运大抽奖");
		System.out.println("\t**********************************************！");
		System.out.println("请选择，输入数字（输入数字0退出）：");
		System.out.println("请选择：");
		int num=sc.nextInt();
		switch(num){
		case 1:
			MainTop();break;
		case 2:
			feedback();break;
		case 0:
			MainTop();break;
			
			
		default:
			
			System.out.print("你输入有误，请重新输入！");break;
		
		}
		}
	
	
	
	
	
	
}
