package cn.zucc.day02;

import java.util.Scanner;

public class hanyan {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("你的比赛是第几名？");
char num = sc.nextchar();
switch(num){
case 一:
System.out.print("参加麻省理工大学夏令营！");break;
case 二:
System.out.print("奖励苹果笔记本电脑一台！");break;
case 三:
System.out.print("奖励移动硬盘一个！");break;
deault:
System.out.print("没你事儿。");break;

}
	}

}
