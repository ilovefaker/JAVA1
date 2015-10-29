package cn.zucc.day02;
import java.util.Scanner;
public class caidan {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\t\t欢迎进入我行我素购物平台");
		System.out.println("\t\t\t1.购物平台");
		System.out.println("\t\t\t2.退出");
		System.out.println("************************************");
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("请选择，输入：");
		int num=sc.nextInt();
		
		switch(num){
		
		case 1:
			System.out.println("欢迎进入购物平台！");break;
		case 2:
			System.out.println("谢谢使用！");break;
		default:
			System.out.println("您输入有误~请重新选择。");break;
			
		
		
		}
		
		
      

	}

}
