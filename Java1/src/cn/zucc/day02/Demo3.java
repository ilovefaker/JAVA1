package cn.zucc.day02;

import java.util.Scanner;

public class Demo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.print("����������Ӣ��ɼ���");
int ZhangScore = sc.nextInt();
if (ZhangScore >= 90){
	
	System.out.print("��ĳɼ�Ϊ�ţ�");
	
}else if(ZhangScore>=80){
	
	System.out.print("��ĳɼ�Ϊ����");
}else if(ZhangScore>=60){
	
	System.out.print("��ĳɼ�Ϊ����");	
}
else{
	
	System.out.print("��ĳɼ�Ϊ������");	
}
	}

}
