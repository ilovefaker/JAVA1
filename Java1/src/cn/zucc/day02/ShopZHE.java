package cn.zucc.day02;

import java.util.Scanner;

public class ShopZHE {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.print("�������Ա����:");
int Jifen=sc.nextInt();
if(Jifen >=8000){
	System.out.print("�û�Ա���ܵĻ�����:6�ۣ�");
		
}
else if(Jifen >=4000){
	System.out.print("�û�Ա���ܵĻ����ǣ�7�ۣ�");
		
}
else if(Jifen >=2000){
	System.out.print("�û�Ա���ܵĻ����ǣ�8�ۣ�");
		
}
else
{
	System.out.print("�û�Ա���ܵĻ����ǣ�9�ۣ�");
		
}





	}

}
