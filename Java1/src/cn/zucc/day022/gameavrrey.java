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
			
			
			System.out.println("�����"+i+"ֵ�ǣ�"+num[i]);
			sum+=num[i];
			
		}
		
		
		System.out.println("����ĺͣ�" +sum);
		
		Scanner sc=new Scanner(System.in);
		System.out.print("������һ�����֣�");
		int aa=sc.nextInt();
		for(int i=0;i<num.length;i++){
			if(aa==num[i])
				
			{
				System.out.print("����������������У�");
			}			
			else{
				System.out.print("��������ֲ��������У�");
			}
		}
		
		
		
		
		
		
		
	}

}
