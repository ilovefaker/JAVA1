package cn.zucc.day03;
import java.util.Scanner;
public class TestNum9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("输入x" );
		int x =sc.nextInt();
		int y;
		if(x<1){
			y=x;
		}else if(x>=1&&x<10){
			y=3*x-2;
			
		
		
		}else{
			y=4*x;
		}
		System.out.println("计算结果是" + y);
		
	}

}
