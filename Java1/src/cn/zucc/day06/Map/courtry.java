package cn.zucc.day06.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class courtry {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String,String> countries =new HashMap<String,String>() ;
		countries.put("cn","中国");
		countries.put("us", "美国");
		countries.put("ru", "俄罗斯");
		/*List<Map> list=new ArrayList<Map>();
		list.add(countries);*/
		
		
		String country1=(String) countries.get("cn");
		System.out.println("cn对应的国家为："+country1);
		
		System.out.println("共有"+countries.size()+"组数据。");
		
		countries.remove("us");
		System.out.println("数据中是否包含us对应的国家?" +countries.containsKey("us"));
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("输入缩写字母查找：");
		String enName=sc.next();
		
		
		/*String country=(String) countries.get(enName);*/
		
		/*for(int i=0;i<countries.size();i++){*/
			if(countries.keySet().contains(enName)){
				
				System.out.println("查找结果为：" +countries.get(enName));
				
				
			
			
			
			
			
		}
		
		
		
		
		
	}

}
