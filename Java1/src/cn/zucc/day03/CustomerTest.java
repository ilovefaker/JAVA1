package cn.zucc.day03;
import java.util.Scanner;
public class CustomerTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerName cn=new CustomerName();
		Scanner sc=new Scanner(System.in);
		System.out.print("������������");
		String name=sc.next();
		System.out.print("���������루y/n����");
		String answer=sc.next();
		
		cn.Input(name,answer);
		
		
		
		
		
		
	}

}
