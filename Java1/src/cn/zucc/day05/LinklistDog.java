package cn.zucc.day05;

import java.util.LinkedList;
import java.util.Scanner;

public class LinklistDog {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		LinkedList<Dog> dogs=new LinkedList<Dog>();
		String flag;
	   do{
	    	Dog dog=new Dog();
	    	System.out.println("�����빷�����֣�");
	    	dog.name=sc.next();
	    	System.out.println("�����빷��Ʒ�֣�");
	    	dog.strain=sc.next();
	    	
	    	System.out.println("�Ƿ��������(y/n)��");
	    	flag=sc.next();
	        dogs.add(dog);	    	    		
	    		    	
	    	
	    }while("y".equals(flag));
	    
	    
		
		for(int i=0;i<dogs.size();i++){
			Dog dog=(Dog) dogs.get(i);
			
			
		    System.out.println(dog.getName()+"\t"+dog.getStrain());
		}
		
		System.out.println("������Ҫ���ڵ�һֻ�Ĺ���������");
		Dog dog1=new Dog();
		dog1.name=sc.next();
		System.out.println("������Ҫ���ڵ�һֻ�Ĺ������ࣺ");
		dog1.strain=sc.next();
		
		dogs.addFirst(dog1);
		
		System.out.println("���������һֻ����������");
		Dog dog2=new Dog();
		dog2.name=sc.next();
		System.out.println("���������һֻ�������ࣺ");
		dog2.strain=sc.next();
		dogs.addLast(dog2);
		
		System.out.println("ɾ����2ֻ����~");
		dogs.remove(3);
		
		for(int i=0;i<dogs.size();i++){
			Dog dog=(Dog) dogs.get(i);
			
			
			System.out.println(dog.name+"\t"+dog.strain);
			
			
			
		}
		
		
	}

	private void add() {
		// TODO Auto-generated method stub
		
	}

}
