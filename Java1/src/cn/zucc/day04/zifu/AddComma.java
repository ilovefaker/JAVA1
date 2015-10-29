package cn.zucc.day04.zifu;

import java.util.Scanner;

public class AddComma {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		System.out.println("ÇëÊäÈëÒ»¶Î×Ö·û£º");
		String x = sc.next();
		StringBuffer word=new StringBuffer(x);
		
		for (int i = x.length()-3 ;i >0; i=i-3) {
			
			word.insert(i, ",");
			
			
		}
		System.out.println(word);
		
		
		
		
	}

}
