package cn.zucc.day04.zifu;

import java.util.Scanner;

public class Market {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("请输入姓名：");
		String name = sc.next();
		
		System.out.println("请输入密码：");
		String code=sc.next();
		
		if(name.equals("TOM")&&code.equals("123456")){
			
			System.out.println("登录成功！");
			System.out.println("*********欢迎进入商城系统********");
			System.out.println("\t编号"+"\t商品"+"\t价格");
			System.out.println("\t1"+"\t洗衣机"+"\t1231");
			System.out.println("\t2"+"\t电冰箱"+"\t6232");
			System.out.println("\t3"+"\t空调"+"\t2312");
			
			System.out.println("********************************");
											
			System.out.println("请输入商品编号：");
			int list=sc.nextInt();
			int price1 = 1232;
			int price2= 6232;
			int price3 = 2312;
			System.out.println("请输入商品数量：");
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
			
		
			
			System.out.println("你应付的总价为："+sum);
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
	}

}
