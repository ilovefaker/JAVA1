package cn.zucc.day03;
import java.util.Scanner;
public class StuHeightTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		StuHeight sh = new StuHeight();
		
		for (int i = 1; i < 6; i++) {
			System.out.print("�������" + i + "��ѧ������ߣ�cm����");
			sh.add(sc.nextInt());
		}
		double avg = sh.getHeight();
		System.out.println("***��5��ѧ����ƽ�����Ϊ��" + avg + "cm****");
	
	}

}
