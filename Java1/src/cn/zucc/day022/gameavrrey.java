package cn.zucc.day022;
import java.util.Scanner;
public class gameavrrey {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num={8,4,2,1,23,344,12};
		int sum=0;
		for(int i=0;i<num.length;i++){
			
			
			System.out.println("数组第"+i+"值是："+num[i]);
			sum+=num[i];
			
		}
		
		
		System.out.println("数组的和：" +sum);
		
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入一个数字：");
		int aa=sc.nextInt();
		for(int i=0;i<num.length;i++){
			if(aa==num[i])
				
			{
				System.out.print("输入的数字在数组中！");
			}			
			else{
				System.out.print("输入的数字不在数组中！");
			}
		}
		
		
		
		
		
		
		
	}

}
