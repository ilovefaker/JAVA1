package cn.zucc.day04;
public class Dog extends Pets{


	String strain;

	public String getStrain() {
		return strain;
	}

	public void setStrain(String strain) {
		this.strain = strain;
	}
	
    public Dog(){
    	
    }
	
	public Dog(String name, int health, int love, String strain) {
		super(name, health, love);
		this.strain = strain;
	}

	public void print(){
		
		System.out.print("½¡¿µ£º"+super.getHealth());
		System.out.print("Ç×ÃÜ¶È£º"+super.getLove());
		System.out.print("Ãû×Ö£º"+super.getName());
		System.out.print("Æ·ÖÖ£º"+strain);
		
		
		
	}
	
	/*public  void cure(){
		
		System.out.print("´òÕë£¬³ÔÓ´°¡");
		
	}*/
	
	public void cure(){
		this.setHealth(70);
		System.out.print("´òÕë£¬³ÔÒ©");
		
	}
}
