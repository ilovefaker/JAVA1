package cn.zucc.day02;

import java.util.Scanner;

public class yundonghui {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("������ɼ���");
int Score = sc.nextInt();
if (Score < 10){
	System.out.print("�������Ա�");
	String sex=sc.next();
	if(sex.equals("��")){
		System.out.println("�μ����Ӿ�����");
		}
	else{
		System.out.println("�μ�Ů�Ӿ�����");
	}
	
	
}
else{
	System.out.println("��δ���������");
}






	}

}
