package cn.zucc.day08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;



public class AddtoSQL {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("无法找到驱动类");
			e.printStackTrace();
			
		}
		Set<Student> set=new HashSet<Student>();
		try {
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "root");
		    Statement stmt=conn.createStatement();
		    System.out.println("连接成功！");
//		    String sql="insert into student(name,SAddress,SGrade,SEmail) values('张老根','南极',2,'8999@qq.com')";
//		    stmt.execute(sql);
		    String sql="select * from student";
		    ResultSet rs = stmt.executeQuery(sql);
		    while(rs.next()){
//		    	System.out.println(rs.getString(1));
		    
		   
		    Student st=new Student();
		    st.setName(rs.getString("name"));
		    st.setSAddress(rs.getString("SAddress"));
		    st.setSGrade(rs.getString("SGrade"));
		    st.setSEmail(rs.getString("sEmail"));
		    set.add(st);
		    }
		    
		    for(Student st:set)
		    	System.out.println(st);
		    
		    
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("插入错误！");
			e.printStackTrace();
		}
	}

}
