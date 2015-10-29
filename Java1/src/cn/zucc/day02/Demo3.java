package cn.zucc.day02;

import java.util.Scanner;

public class Demo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.print("请输入张三英语成绩：");
int ZhangScore = sc.nextInt();
if (ZhangScore >= 90){
	
	System.out.print("你的成绩为优！");
	
}else if(ZhangScore>=80){
	
	System.out.print("你的成绩为良！");
}else if(ZhangScore>=60){
	
	System.out.print("你的成绩为及格！");	
}
else{
	
	System.out.print("你的成绩为不及格！");	
}
	}

}
