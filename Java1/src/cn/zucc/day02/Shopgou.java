package cn.zucc.day02;
import java.util.Scanner;
public class Shopgou {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入消费金额：");
		int num=sc.nextInt();
		if(num>=200){
			System.out.println("已满200元，可选择：");
			System.out.println("1.加10元，换购洗衣粉");
			System.out.println("2.加20元，换购爽肤水一瓶");
			System.out.println("3.不参与换购");
			System.out.println("请选择，输入：");
			int take1=sc.nextInt();
			switch(take1){
			    case 1:
				     System.out.println("恭喜获得洗衣粉一袋！");break;
				
			    case 2:
				     System.out.println("恭喜获得爽肤水一瓶！");break;
			    case 3:
				     System.out.println("谢谢购物！");break;
				default:
					 System.out.println("输入有误！");break;	
					}}
		else if(num>=100){
				System.out.println("已满100元，可选择：");
				System.out.println("1.加3元，换购可乐一听");
				System.out.println("2.加10元，换购爽面粉一斤");
				System.out.println("3.不参与换购");
				System.out.println("请选择，输入：");
				int take2=sc.nextInt();
				switch(take2){
				    case 1:
					     System.out.print("恭喜获得可乐一听！");break;
					
				    case 2:
					     System.out.print("恭喜获得面粉一斤！");break;

				    case 3:
					     System.out.print("谢谢购物！");break;
					default:
						 System.out.print("输入有误！");break;	
						}}	
		else if(num>=50){
					System.out.println("已满50元，可选择：");
					System.out.println("1.加2元，换购餐巾纸");
					System.out.println("2.不参与换购");
					
					System.out.println("请选择，输入：");
					int take4=sc.nextInt();
					switch(take4){
					    case 1:
						     System.out.print("恭喜获得餐巾纸一包！");break;
						
					    case 2:
						     System.out.print("谢谢购物！");break;
						default:
							 System.out.print("输入有误！");break;	
							}	}
	
	else{
						System.out.print("谢谢购物！");	
					}
					}
}
				
				
	
	

