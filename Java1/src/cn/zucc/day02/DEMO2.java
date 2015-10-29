package cn.zucc.day02;

import java.util.Scanner;

public class DEMO2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.print("请输入张浩Java成绩：");
int JavaScore=sc.nextInt();
System.out.print("请输入张浩Music成绩:");
int MusicScore=sc.nextInt();
if ((JavaScore > 98 && MusicScore >80)||(JavaScore == 100 && MusicScore > 70)){
	
	System.out.print("获得一个MP4奖励！");}
	else {
		
		System.out.print("获得一个鸡腿奖励！");
	}
}


	}


