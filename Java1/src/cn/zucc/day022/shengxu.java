package cn.zucc.day022;
import java.util.Arrays;
import java.util.Scanner;
public class shengxu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int[] num=new int[5];
		for(int i=0;i<num.length;i++){
			
				
		System.out.print("�������"+i+"��ͬѧ�ĳɼ���");
		num[i]=sc.nextInt();
		
				
		}
		
		Arrays.sort(num);
		System.out.print("���������У�");
		for(int i=num.length-1;i>=0;i--){
			System.out.print(""+num[i]);
		}
			
		
	}

}
