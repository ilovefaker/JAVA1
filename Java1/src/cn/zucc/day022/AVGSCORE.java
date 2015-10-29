package cn.zucc.day022;
import java.util.Scanner;
public class AVGSCORE {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
        
		int[] score; int i;
		int sum=0;
		score=new int[30];
		
		for(i=0;i<score.length;i++){
			
			System.out.print("请输入数组的第"+i+"个数:");
			score[i]=input.nextInt();
				
			sum+=score[i];
		}
		
		double avg;
		avg=sum/30;
		System.out.print("平均成绩是："+avg);
		
		
		
		
		
		
		
		
	}

}
