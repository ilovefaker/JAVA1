package cn.zucc.day04.zifu;
import java.util.Scanner;
public class nolessthan6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sw=new Scanner(System.in);
		System.out.print("���������������");
		String uname=sw.next();
		System.out.print("������������룺");
		String code=sw.next();
		if(code.length()>=6){
			System.out.print("��ϲ��ע��ɹ���");
		}
		else{
			System.out.print("���������볬��6λ��");
		}
		
		
		
		
		
	}

}
