package cn.zucc.day02;
import java.util.Scanner;
public class Shopgou {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
		System.out.print("���������ѽ�");
		int num=sc.nextInt();
		if(num>=200){
			System.out.println("����200Ԫ����ѡ��");
			System.out.println("1.��10Ԫ������ϴ�·�");
			System.out.println("2.��20Ԫ������ˬ��ˮһƿ");
			System.out.println("3.�����뻻��");
			System.out.println("��ѡ�����룺");
			int take1=sc.nextInt();
			switch(take1){
			    case 1:
				     System.out.println("��ϲ���ϴ�·�һ����");break;
				
			    case 2:
				     System.out.println("��ϲ���ˬ��ˮһƿ��");break;
			    case 3:
				     System.out.println("лл���");break;
				default:
					 System.out.println("��������");break;	
					}}
		else if(num>=100){
				System.out.println("����100Ԫ����ѡ��");
				System.out.println("1.��3Ԫ����������һ��");
				System.out.println("2.��10Ԫ������ˬ���һ��");
				System.out.println("3.�����뻻��");
				System.out.println("��ѡ�����룺");
				int take2=sc.nextInt();
				switch(take2){
				    case 1:
					     System.out.print("��ϲ��ÿ���һ����");break;
					
				    case 2:
					     System.out.print("��ϲ������һ�");break;

				    case 3:
					     System.out.print("лл���");break;
					default:
						 System.out.print("��������");break;	
						}}	
		else if(num>=50){
					System.out.println("����50Ԫ����ѡ��");
					System.out.println("1.��2Ԫ�������ͽ�ֽ");
					System.out.println("2.�����뻻��");
					
					System.out.println("��ѡ�����룺");
					int take4=sc.nextInt();
					switch(take4){
					    case 1:
						     System.out.print("��ϲ��òͽ�ֽһ����");break;
						
					    case 2:
						     System.out.print("лл���");break;
						default:
							 System.out.print("��������");break;	
							}	}
	
	else{
						System.out.print("лл���");	
					}
					}
}
				
				
	
	

