package cn.zucc.day02;

import java.util.Scanner;

public class buycar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.print("���ж������д�");
double Money = sc.nextDouble();

if(Money >5000000){
	
	System.out.print("��������һ������");
	
}
else if(Money >1000000){
	
	System.out.print("��������һ���һ���");
	
}
else if(Money >500000){
	
	System.out.print("��������һ��ϴ�»���");
	
}
else {
	
	System.out.print("��������һ���±���");
	
}


	}

}
