package cn.zucc.day04;

public class Master {

	/*public void cure(Dog dog){
		if(dog.getHealth()<50){
			dog.setHealth(80);
			System.out.print("´òÕë£¬³ÔÒ©°¡");	
			
		}
	}
		
	public void cure(Penguin penguin){
		if(penguin.getHealth()<60){
			penguin.setHealth(70);
			System.out.print("³ÔÒ©£¬ÁÆÑø°¡");
		}
		
		
		
		
	}
		
		
	}
	*/
	public void cure(Pets pet){
		
		if (pet.getHealth()<50)
			pet.cure();
		
	}
	
	
	
}
