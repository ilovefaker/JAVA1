package cn.zucc.day03;

import java.util.Scanner;

public class FiveStuTest {

	public static void main(String[] args) {
		
		FiveStu fs = new FiveStu();
		System.out.println("�밴˳��¼��5��ѧ����������");
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			String name = sc.next();
			fs.add(name);	
		}
		
		String[] names = fs.show();
		System.out.println("****�����****");
		for (int i = 0; i < names.length; i++) {
			if(names[i] != null){
				System.out.print(names[i] + "\t");
			}
		}
	}
}
