package cn.zucc.day022;

public class Customer {

	String name;
	int age;
	int price;
	
	public void show(){
		
		if(age>18){
			System.out.print("你输入的年龄是"+age+",票价为20元");
		} else if(age>10){
			System.out.print("你输入的年龄是"+age+",票价为10元");
		}
		else{
			System.out.print("你输入的年龄是"+age+",票价为10元");
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
