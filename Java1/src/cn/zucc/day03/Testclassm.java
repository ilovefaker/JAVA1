package cn.zucc.day03;
import java.util.Scanner;
public class Testclassm {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner st=new Scanner(System.in);
		ClassM cm=new ClassM();
		String flag;
		do{
			System.out.print("请输入姓名：");
			String name=st.next();
			System.out.print("是否继续输入（y/n）");
			flag=st.next();
			cm.addName(name);
			
			
			
		}while(flag.equals("y"));
		cm.showName();
		
		System.out.println("请输入要查找的客户名字：");
		String name1=st.next();
		if(cm.search(name1)){
			System.out.println("查到结果！");
		}
		else{
			System.out.println("没查到！");
		}
		
		
		
	}

}
