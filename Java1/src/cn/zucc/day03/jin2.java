package cn.zucc.day03;

import java.util.Scanner;

public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*SaveMoney sm = new SaveMoney();
		sm.login();
*/
	
	Scanner sc = new Scanner(System.in);
	CustomerText ct = new CustomerText();
	int index =0;
	String flag ;
	do{
		System.out.println("������ͻ�����");
		String name=sc.next();
		System.out.println("�Ƿ��������(y/n?)");
		flag=sc.next();
		
	    ct.addName(name);
		} while(flag.equals("y"));
		ct.showName();
		System.out.println("������Ҫ���ҵĿͻ�������");
		String name1 =sc.next();
		
		if(ct.search(name1)){
		System.out.println("���ҽ����");
		System.out.println("�ҵ��ˣ�");
		}
		else {
			System.out.println("û�ҵ�");
			}
		}
	
         
}

