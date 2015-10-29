package cn.zucc.day05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayPenguin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		List<Penguin> penguins=new ArrayList<Penguin>();
		
		
		String flag ;
		do{
			Penguin pg=new Penguin();
		    System.out.println("请输入宠物企鹅的名字：");
		    pg.name=sc.next();
		    System.out.println("请输入宠物的服装：");
		    pg.cloths=sc.next();
		    System.out.println("是否继续输入？(y/n)");
		    flag=sc.next();
		    penguins.add(pg);
		    
		
		}while("y".equals(flag));
		
		System.out.println("宠物数量是："+penguins.size());
		System.out.println("删除第二只宠物~");
		penguins.remove(1);
		for(int i=0;i<penguins.size();i++){
			
			Penguin pg=(Penguin) penguins.get(i);
		System.out.println(pg.name+"\t"+pg.cloths);
		}
		
		System.out.println("查询企鹅，请输入名字：");
		String name1=sc.next();
		
/*		for (int i = 0; i < penguins.size(); i++) {
			
			if(penguins.){
				
				System.out.println("有");
				
			}
			
		}*/
		
		

	}

}
