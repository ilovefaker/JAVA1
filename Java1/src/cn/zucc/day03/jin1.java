package cn.zucc.day03;

import java.util.Scanner;

public class {
	String[] name1 = new String[45000];
	int i = 0;

	public void addName(String name) {
		name1[i] = name;
		i++;
	}

	public void showName() {
		System.out.println("************************");
		System.out.println("\t�ͻ������б�");
		System.out.println("************************");
		for (int j = 0; j < i; j++) {

			
			System.out.println(name1[j]);
		}

	}

	public boolean search(String name) {
		for (int j = 0; j < i; j++) {

			if (name1[j].equals(name)) {
				return true;
			}

		}
		return false;
	}
}

