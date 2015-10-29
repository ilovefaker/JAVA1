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
			System.out.print("请输入第" + i + "名学生的身高（cm）：");
			sh.add(sc.nextInt());
		}
		double avg = sh.getHeight();
		System.out.println("***这5名学生的平均身高为：" + avg + "cm****");
	
	}

}
