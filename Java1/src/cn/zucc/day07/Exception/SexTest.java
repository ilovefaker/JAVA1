package cn.zucc.day07.Exception;

import java.util.Scanner;

public class SexTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sex sex=new Sex();
		try{
			Scanner sc=new Scanner(System.in);
			System.out.println("«Î ‰»Î–‘±£∫");
			sex.setSex(sc.next());
			sex.print();
		}
		catch(Exception e){
			
			e.printStackTrace();
		}
		
		
	}

}
