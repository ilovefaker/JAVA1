package cn.zucc.day02;

import java.util.Scanner;

public class buycar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.print("你有多少银行存款？");
double Money = sc.nextDouble();

if(Money >5000000){
	
	System.out.print("建议你买一个月球。");
	
}
else if(Money >1000000){
	
	System.out.print("建议你买一俩灰机。");
	
}
else if(Money >500000){
	
	System.out.print("建议你买一俩洗衣机。");
	
}
else {
	
	System.out.print("建议你买一个月饼。");
	
}


	}

}
