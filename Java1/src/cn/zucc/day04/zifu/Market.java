package cn.zucc.day04.zifu;

import java.util.Scanner;

public class Market {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("������������");
		String name = sc.next();
		
		System.out.println("���������룺");
		String code=sc.next();
		
		if(name.equals("TOM")&&code.equals("123456")){
			
			System.out.println("��¼�ɹ���");
			System.out.println("*********��ӭ�����̳�ϵͳ********");
			System.out.println("\t���"+"\t��Ʒ"+"\t�۸�");
			System.out.println("\t1"+"\tϴ�»�"+"\t1231");
			System.out.println("\t2"+"\t�����"+"\t6232");
			System.out.println("\t3"+"\t�յ�"+"\t2312");
			
			System.out.println("********************************");
											
			System.out.println("��������Ʒ��ţ�");
			int list=sc.nextInt();
			int price1 = 1232;
			int price2= 6232;
			int price3 = 2312;
			System.out.println("��������Ʒ������");
			int sum =0;
			int num=sc.nextInt();
			
			
			switch(list){
			
			
			     case 1:   
			     sum = price1 * num;
			     break;
			     case 2: 
			    	 sum = price2 * num;
			     break;
			     case 3:   
			    	 sum = price3 * num;
			     break;
					
			}
			
		
			
			System.out.println("��Ӧ�����ܼ�Ϊ��"+sum);
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
	}

}
