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
		
		System.out.print("ÇëÊäÈëĞÕÃû£º");
		String name=sw.next();
		System.out.print("ÇëÊäÈëÃÜÂë£º");
		String code=sw.next();
		
		if(name.equals("TOM")&&code.equals("1234567")){
			
			System.out.print("µÇÂ¼³É¹¦£¡");
			
			
		}
		else{
			System.out.print("µÇÂ¼Ê§°Ü£¡");
			
		}
		
	}

}
