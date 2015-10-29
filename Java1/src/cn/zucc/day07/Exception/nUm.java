package cn.zucc.day07.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class nUm {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try{
	
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入数字1：");
		int num1=sc.nextInt();
		System.out.println("请输入数字2：");
		int num2=sc.nextInt();
			
			
			System.out.println("商为;"+num1/num2);
			System.out.println("和为："+(num1+num2));
			}catch(InputMismatchException e){
				System.out.println("被除数和除数都应该为整数");
			
			}catch(ArithmeticException e){
				System.err.println("除数不为0");
			}catch(Exception e){
				System.err.println("其他异常情况。");
			}finally{
				System.err.println("欢迎提出建议！");
			}
		}
		
		
		

	}

