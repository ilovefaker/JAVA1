package cn.zucc.day03;
import java.util.Arrays;
public class FiveStu {

String[] students = new String[5];
	
	public void add(String name){
		for (int i = 0; i < students.length; i++) {
			if(students[i] == null){
				students[i] = name;
				break;
			}
		}
	}
	
	
	public String[] show(){
		Arrays.sort(students);
		return students;
	}
	
}
	
	
	
	
	
	

