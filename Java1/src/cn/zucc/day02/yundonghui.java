package cn.zucc.day02;

import java.util.Scanner;

public class yundonghui {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("请输入成绩：");
int Score = sc.nextInt();
if (Score < 10){
	System.out.print("请输入性别：");
	String sex=sc.next();
	if(sex.equals("男")){
		System.out.println("参加男子决赛！");
		}
	else{
		System.out.println("参加女子决赛！");
	}
	
	
}
else{
	System.out.println("你未进入决赛！");
}






	}

}
