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
			System.out.print("�������Ա��ţ�");
			int num=st.nextInt();
			System.out.print("�������Ա���֣�");
			int score=st.nextInt();
			vip.num=num;
			vip.score=score;
			vm.AddVip(vip);
			System.out.print("�Ƿ�������룿��y/n��");
			flag=st.next();
			
		}while(flag.equals("y"));
		System.out.println("***��Ա�б�***");
		vm.show();
	}

}
