package cn.zucc.day05;


import java.util.ArrayList;
import java.util.List;

public class DogArreys {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			Dog beibeiDog=new Dog("贝贝","哈士奇");
			Dog hahaDog=new Dog("哈哈","拉布拉多");
			Dog xixiDog=new Dog("嘻嘻","哈士奇");
			Dog papaDog=new Dog("趴趴","班得瑞");
			
			
			List<Dog> dogs=new ArrayList<Dog>();
			dogs.add(beibeiDog);
			dogs.add(hahaDog);
			dogs.add(2,xixiDog);
			dogs.add(papaDog);
			
			dogs.remove(2);
			dogs.remove(hahaDog);
			
			System.out.println("共有"+dogs.size()+"只狗");
			
			System.out.println("分别是：");
			
			for(int i=0;i<dogs.size();i++){
				
				Dog dog=(Dog) dogs.get(i);
				System.out.println(dog.getName()+"\t"+dog.getStrain());
			}
		
			
			if(dogs.contains(hahaDog)){
				
				System.out.println("有哈哈狗");
				
				
				
				
			}
			else{
				System.out.println("没有哈哈狗");
			}
			
		
		
		
		
	}

}
