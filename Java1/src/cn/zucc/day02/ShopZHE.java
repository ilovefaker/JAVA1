package cn.zucc.day02;

import java.util.Scanner;

public class ShopZHE {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.print("请输入会员积分:");
int Jifen=sc.nextInt();
if(Jifen >=8000){
	System.out.print("该会员享受的积分是:6折！");
		
}
else if(Jifen >=4000){
	System.out.print("该会员享受的积分是：7折！");
		
}
else if(Jifen >=2000){
	System.out.print("该会员享受的积分是：8折！");
		
}
else
{
	System.out.print("该会员享受的积分是：9折！");
		
}





	}

}
