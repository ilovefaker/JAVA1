package cn.zucc.day04.zifu;

import java.util.Scanner;

public class SearchAi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner sc =new Scanner(System.in);
		System.out.println("������һ���ַ���");
		String word=sc.next();
		System.out.println("������Ҫ���ҵ��ַ���");
		
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
