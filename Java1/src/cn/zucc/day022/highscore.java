package cn.zucc.day022;
import java.util.Arrays;
import java.util.Scanner;
public class highscore {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
		int[] score=new int[5];
		for(int i=0;i<score.length;i++){
			System.out.print("请输入成绩：");
			score[i]=sc.nextInt();
			
		}
		
		Arrays.sort(score);
		int top = score[4];
		System.out.print("最大的数字为：" + top);
		
		
		
		
	}

}
