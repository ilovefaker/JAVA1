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
		System.out.println("����������1��");
		int num1=sc.nextInt();
		System.out.println("����������2��");
		int num2=sc.nextInt();
			
			
			System.out.println("��Ϊ;"+num1/num2);
			System.out.println("��Ϊ��"+(num1+num2));
			}catch(InputMismatchException e){
				System.out.println("�������ͳ�����Ӧ��Ϊ����");
			
			}catch(ArithmeticException e){
				System.err.println("������Ϊ0");
			}catch(Exception e){
				System.err.println("�����쳣�����");
			}finally{
				System.err.println("��ӭ������飡");
			}
		}
		
		
		

	}

