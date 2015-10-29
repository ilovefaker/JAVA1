package cn.zucc.day022;
import java.util.Scanner;
public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner st=new Scanner(System.in);
        Customer cm=new Customer();
        System.out.println("请输入姓名：");
        cm.name=st.next();
        System.out.println("请输入年龄：");
        cm.age=st.nextInt();
        cm.show();
        
	} 

}
