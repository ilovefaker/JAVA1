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
		countries.put("cn","�й�");
		countries.put("us", "����");
		countries.put("ru", "����˹");
		/*List<Map> list=new ArrayList<Map>();
		list.add(countries);*/
		
		
		String country1=(String) countries.get("cn");
		System.out.println("cn��Ӧ�Ĺ���Ϊ��"+country1);
		
		System.out.println("����"+countries.size()+"�����ݡ�");
		
		countries.remove("us");
		System.out.println("�������Ƿ����us��Ӧ�Ĺ���?" +countries.containsKey("us"));
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("������д��ĸ���ң�");
		String enName=sc.next();
		
		
		/*String country=(String) countries.get(enName);*/
		
		/*for(int i=0;i<countries.size();i++){*/
			if(countries.keySet().contains(enName)){
				
				System.out.println("���ҽ��Ϊ��" +countries.get(enName));
				
				
			
			
			
			
			
		}
		
		
		
		
		
	}

}
