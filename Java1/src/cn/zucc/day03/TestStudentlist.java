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
      System.out.println("������Ҫ���滻��ѧ�����֣�");
      String oldname=st.next();
      System.out.println("������Ҫ�滻��ѧ�����֣�");
      String newname=st.next();
           if(sl.addname(oldname,newname)){
    	  	System.out.print("�ҵ����޸ĳɹ���");
    	  	}
    	  	
    	   else {System.out.print("δ�ҵ���");}
    	sl.Show();   
      }
	}


