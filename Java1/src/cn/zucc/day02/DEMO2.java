package cn.zucc.day02;

import java.util.Scanner;

public class DEMO2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.print("�������ź�Java�ɼ���");
int JavaScore=sc.nextInt();
System.out.print("�������ź�Music�ɼ�:");
int MusicScore=sc.nextInt();
if ((JavaScore > 98 && MusicScore >80)||(JavaScore == 100 && MusicScore > 70)){
	
	System.out.print("���һ��MP4������");}
	else {
		
		System.out.print("���һ�����Ƚ�����");
	}
}


	}


