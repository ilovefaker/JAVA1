package cn.zucc.day03;
import java.util.Scanner;
public class TestStudentlist {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentList sl=new StudentList();
		
		
      Scanner st=new Scanner(System.in);
      System.out.println("请输入要被替换的学生名字：");
      String oldname=st.next();
      System.out.println("请输入要替换的学生名字：");
      String newname=st.next();
           if(sl.addname(oldname,newname)){
    	  	System.out.print("找到并修改成功！");
    	  	}
    	  	
    	   else {System.out.print("未找到！");}
    	sl.Show();   
      }
	}


