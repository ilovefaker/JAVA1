package cn.zucc.day04.zifu;
import java.util.Scanner;
public class Register {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sw=new Scanner(System.in);
		System.out.print("������������");
		String name=sw.next();
		System.out.print("���������룺");
		String code1=sw.next();
		System.out.print("���ٴ��������룺");
		String code2=sw.next();
		if(name.length()>=3&&code1.length()>=6&&code1.equals(code2)){
			
			System.out.print("��ϲ��ע��ɹ���");
		}
		else if(name.length()<3){
			System.out.print("����Ӧ�ô���3���ַ���");
		}
		else if(code1.length()<6){
			System.out.print("����Ӧ����6���ַ���");
		}
		else if(!code1.equals(code2)){
			System.out.print("��������������һ�£�");
		}
		
		
		
		}
		
		
	}


