package cn.zucc.day06.Zoo;

import java.util.ArrayList;
import java.util.List;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  System.out.println("����\t\t�ȵėl��\t\t��");
		Animal an1 = new Cat("�ӷ�؈",4);
		Animal an2=new dolphin("���໨��",0);
		Animal an3=new Dog("С����",4);
		
		
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
			
			System.out.print("�o\t\t");;
		}
		
		an.show();
		
		}
		
		
	}

}
