package cn.zucc.day03;

import java.util.Scanner;

public class FiveStuTest {

	public static void main(String[] args) {
		
		FiveStu fs = new FiveStu();
		System.out.println("请按顺序录入5个学生的姓名：");
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			String name = sc.next();
			fs.add(name);	
		}
		
		String[] names = fs.show();
		System.out.println("****排序后****");
		for (int i = 0; i < names.length; i++) {
			if(names[i] != null){
				System.out.print(names[i] + "\t");
			}
		}
	}
}
