/**
 * 
 */
package cn.zucc.day04.zifu;
import java.util.Scanner;
/**
 * @author Administrator
 *
 */
public class Enter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sw=new Scanner(System.in);
		
		System.out.print("������������");
		String name=sw.next();
		System.out.print("���������룺");
		String code=sw.next();
		
		if(name.equals("TOM")&&code.equals("1234567")){
			
			System.out.print("��¼�ɹ���");
			
			
		}
		else{
			System.out.print("��¼ʧ�ܣ�");
			
		}
		
	}

}
