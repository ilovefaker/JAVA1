package cn.zucc.day022;

import java.util.Scanner;

public class ShopMarket {
    Scanner sc= new Scanner(System.in); 
	public void login(){
		System.out.println("\t��ӭ�����������ع���ϵͳ��");
		System.out.println("\t\t1.��¼ϵͳ");
		System.out.println("\t\t2.�˳�");
		System.out.println("\t**********************************************��");
	    System.out.println("��ѡ��");
		int num=sc.nextInt();
		switch(num){
		case 1:
			MainTop();break;
		case 2:
			System.out.print("ллʹ��~");break;
		default:
			
			System.out.print("�������������������룡");break;
		}
		}
	public void MainTop(){
		
		System.out.println("\t\t1.�ͻ���Ϣ����");
		System.out.println("\t\t2.�������");
		System.out.println("\t**********************************************��");
		System.out.println("��ѡ���������֣���������0�˳�����");
		System.out.println("��ѡ��");
		int num=sc.nextInt();
		switch(num){
		case 1:
			MainTop();break;
		case 2:
			feedback();break;
		case 0:
			MainTop();break;
			
			
		default:
			
			System.out.print("�������������������룡");break;
		
		}
		}
	public void feedback(){
		
		System.out.println("\t\t1.���˴����");
		System.out.println("\t\t2.���˴�齱");
		System.out.println("\t**********************************************��");
		System.out.println("��ѡ���������֣���������0�˳�����");
		System.out.println("��ѡ��");
		int num=sc.nextInt();
		switch(num){
		case 1:
			MainTop();break;
		case 2:
			feedback();break;
		case 0:
			MainTop();break;
			
			
		default:
			
			System.out.print("�������������������룡");break;
		
		}
		}
	
	
	
	
	
	
}
