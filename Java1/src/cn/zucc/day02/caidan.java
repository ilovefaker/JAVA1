package cn.zucc.day02;
import java.util.Scanner;
public class caidan {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\t\t��ӭ�����������ع���ƽ̨");
		System.out.println("\t\t\t1.����ƽ̨");
		System.out.println("\t\t\t2.�˳�");
		System.out.println("************************************");
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("��ѡ�����룺");
		int num=sc.nextInt();
		
		switch(num){
		
		case 1:
			System.out.println("��ӭ���빺��ƽ̨��");break;
		case 2:
			System.out.println("ллʹ�ã�");break;
		default:
			System.out.println("����������~������ѡ��");break;
			
		
		
		}
		
		
      

	}

}
