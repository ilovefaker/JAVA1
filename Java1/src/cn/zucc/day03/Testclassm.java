package cn.zucc.day03;
import java.util.Scanner;
public class Testclassm {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner st=new Scanner(System.in);
		ClassM cm=new ClassM();
		String flag;
		do{
			System.out.print("������������");
			String name=st.next();
			System.out.print("�Ƿ�������루y/n��");
			flag=st.next();
			cm.addName(name);
			
			
			
		}while(flag.equals("y"));
		cm.showName();
		
		System.out.println("������Ҫ���ҵĿͻ����֣�");
		String name1=st.next();
		if(cm.search(name1)){
			System.out.println("�鵽�����");
		}
		else{
			System.out.println("û�鵽��");
		}
		
		
		
	}

}
