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
		System.out.println("�����(1.����2.���)��");
		int choose=sw.nextInt();
		
		
		
		
		ui.sevice(choose);
		
		
	}

}
