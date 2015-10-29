package cn.zucc.day06.Zoo;

import java.util.ArrayList;
import java.util.List;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  System.out.println("名字\t\t腿的條數\t\t叫聲");
		Animal an1 = new Cat("加菲貓",4);
		Animal an2=new dolphin("海豚花花",0);
		Animal an3=new Dog("小狗喔喔",4);
		
		
		List<Animal> list = new ArrayList<Animal>();
		list.add(an1);
		list.add(an2);
		list.add(an3);
		for(Animal an:list){
		System.out.print(an);
		if(an instanceof LegNum)
		{
//			int i=an.getLegNum();
			
			System.out.print(an.getLegNum()+"\t\t");
//			an.show();
			
		}else{
			
			System.out.print("無\t\t");;
		}
		
		an.show();
		
		}
		
		
	}

}
