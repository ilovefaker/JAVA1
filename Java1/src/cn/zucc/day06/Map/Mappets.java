package cn.zucc.day06.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Mappets implements Map {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, String> Pets=new HashMap<String, String>();
		Pets.put("MM", "���С����");
		Pets.put("GG","��");
		Pets.put("FF", "è");
		Pets.put("PP", "��");
		
		
		Scanner sc=new Scanner(System.in);
	    System.out.println("��������ҽ����");
		String enName=sc.next();
		
		if(Pets.keySet().contains(enName)){
			
			System.out.println("����ҵĽ��Ϊ��"+Pets.get(enName));
			
			
		}else {
			System.out.println("δ�ҵ����~");
			
		}
		
		
		
		
		
		
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean containsKey(Object key) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsValue(Object value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Set entrySet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object get(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Set keySet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object put(Object key, Object value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void putAll(Map m) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object remove(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Collection values() {
		// TODO Auto-generated method stub
		return null;
	}

}
