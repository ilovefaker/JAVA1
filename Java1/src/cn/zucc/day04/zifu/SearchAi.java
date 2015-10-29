package cn.zucc.day04.zifu;

import java.util.Scanner;

public class SearchAi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner sc =new Scanner(System.in);
		System.out.println("请输入一段字符：");
		String word=sc.next();
		System.out.println("请输入要查找的字符：");
		
		char searchWord=sc.next().charAt(0);
		int sum=0;
		for (int i = 0; i < word.length(); i++) {
			if(word.charAt(i)==searchWord){
				
				sum++;
			}		
			}	
		System.out.println(sum);
	
	}

}
