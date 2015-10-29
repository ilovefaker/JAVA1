package cn.zucc.day04;
import java.util.Scanner;
public class UsbTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UsbImplement ui=new UsbImplement();
		Scanner sw=new Scanner(System.in);
		System.out.println("«Î≤Â»Î(1.µÁ…»2. Û±Í)£∫");
		int choose=sw.nextInt();
		
		
		
		
		ui.sevice(choose);
		
		
	}

}
