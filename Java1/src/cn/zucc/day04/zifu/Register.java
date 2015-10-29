package cn.zucc.day04.zifu;
import java.util.Scanner;
public class Register {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sw=new Scanner(System.in);
		System.out.print("请输入姓名：");
		String name=sw.next();
		System.out.print("请输入密码：");
		String code1=sw.next();
		System.out.print("请再次输入密码：");
		String code2=sw.next();
		if(name.length()>=3&&code1.length()>=6&&code1.equals(code2)){
			
			System.out.print("恭喜，注册成功！");
		}
		else if(name.length()<3){
			System.out.print("名字应该大于3个字符！");
		}
		else if(code1.length()<6){
			System.out.print("密码应大于6个字符！");
		}
		else if(!code1.equals(code2)){
			System.out.print("俩次密码请输入一致！");
		}
		
		
		
		}
		
		
	}


