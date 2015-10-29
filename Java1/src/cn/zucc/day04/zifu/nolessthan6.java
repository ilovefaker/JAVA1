package cn.zucc.day04.zifu;
import java.util.Scanner;
public class nolessthan6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sw=new Scanner(System.in);
		System.out.print("请输入你的姓名：");
		String uname=sw.next();
		System.out.print("请输入你的密码：");
		String code=sw.next();
		if(code.length()>=6){
			System.out.print("恭喜，注册成功！");
		}
		else{
			System.out.print("请输入密码超过6位！");
		}
		
		
		
		
		
	}

}
