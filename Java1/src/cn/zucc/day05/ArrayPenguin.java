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
		    System.out.println("����������������֣�");
		    pg.name=sc.next();
		    System.out.println("���������ķ�װ��");
		    pg.cloths=sc.next();
		    System.out.println("�Ƿ�������룿(y/n)");
		    flag=sc.next();
		    penguins.add(pg);
		    
		
		}while("y".equals(flag));
		
		System.out.println("���������ǣ�"+penguins.size());
		System.out.println("ɾ���ڶ�ֻ����~");
		penguins.remove(1);
		for(int i=0;i<penguins.size();i++){
			
			Penguin pg=(Penguin) penguins.get(i);
		System.out.println(pg.name+"\t"+pg.cloths);
		}
		
		System.out.println("��ѯ��죬���������֣�");
		String name1=sc.next();
		
/*		for (int i = 0; i < penguins.size(); i++) {
			
			if(penguins.){
				
				System.out.println("��");
				
			}
			
		}*/
		
		

	}

}
