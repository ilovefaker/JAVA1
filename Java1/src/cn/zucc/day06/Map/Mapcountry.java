package cn.zucc.day06.Map;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mapcountry {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Country> Countries=new ArrayList<Country>();
		
		
		String flag;
		Scanner sc=new Scanner(System.in);
		
		do{
			
			Country ct=new Country();
			System.out.println("请输入国家简称：");
			String key=sc.next();
			System.out.println("请输入国家名称：");
			String value=sc.next();
			
			Countries.add(ct);
			
			System.out.println("是否继续输入(y/n)：");
			flag=sc.next();
			
			
			
			
			
		}while(flag.equals("y"));
		
		for(Country ct:Countries){
			
			
			
			System.out.println(ct.getKey()+ct.getValue());
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
