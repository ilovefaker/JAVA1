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
			
			System.out.print("����������ĵ�"+i+"����:");
			score[i]=input.nextInt();
				
			sum+=score[i];
		}
		
		double avg;
		avg=sum/30;
		System.out.print("ƽ���ɼ��ǣ�"+avg);
		
		
		
		
		
		
		
		
	}

}
