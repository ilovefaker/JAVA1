package cn.zucc.day03;
import java.util.Scanner;
public class TestVip {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		Scanner st=new Scanner(System.in);
		VipManager vm=new VipManager(); 
		String flag;
		do{
			Vip vip=new Vip();
			System.out.print("请输入会员编号：");
			int num=st.nextInt();
			System.out.print("请输入会员积分：");
			int score=st.nextInt();
			vip.num=num;
			vip.score=score;
			vm.AddVip(vip);
			System.out.print("是否继续输入？（y/n）");
			flag=st.next();
			
		}while(flag.equals("y"));
		System.out.println("***会员列表***");
		vm.show();
	}

}
