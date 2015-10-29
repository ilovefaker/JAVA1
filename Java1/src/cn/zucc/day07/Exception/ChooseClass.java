package cn.zucc.day07.Exception;

import java.util.Scanner;

public class ChooseClass {

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		ClassNum classnum = new ClassNum();
		try {
			classnum.classsearch(num);
		} catch (Exception e) {
			// TODO: handle exception
			
			e.printStackTrace();
		}
		
	}
}
