package cn.zucc.day05;


import java.util.ArrayList;
import java.util.List;

public class DogArreys {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			Dog beibeiDog=new Dog("����","��ʿ��");
			Dog hahaDog=new Dog("����","��������");
			Dog xixiDog=new Dog("����","��ʿ��");
			Dog papaDog=new Dog("ſſ","�����");
			
			
			List<Dog> dogs=new ArrayList<Dog>();
			dogs.add(beibeiDog);
			dogs.add(hahaDog);
			dogs.add(2,xixiDog);
			dogs.add(papaDog);
			
			dogs.remove(2);
			dogs.remove(hahaDog);
			
			System.out.println("����"+dogs.size()+"ֻ��");
			
			System.out.println("�ֱ��ǣ�");
			
			for(int i=0;i<dogs.size();i++){
				
				Dog dog=(Dog) dogs.get(i);
				System.out.println(dog.getName()+"\t"+dog.getStrain());
			}
		
			
			if(dogs.contains(hahaDog)){
				
				System.out.println("�й�����");
				
				
				
				
			}
			else{
				System.out.println("û�й�����");
			}
			
		
		
		
		
	}

}
