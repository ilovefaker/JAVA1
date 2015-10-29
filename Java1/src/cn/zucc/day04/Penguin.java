package cn.zucc.day04;

public class Penguin extends Pets{

	

	private String Sex;
	
	public String getSex(){
		return Sex;
		
	}
	
	
	public void setSex(String Sex){
		
		this.Sex=Sex;
	}
	
	public Penguin(String name, int health, int love,String Sex) {
		super(name, health, love);
		// TODO Auto-generated constructor stub
		
		this.Sex=Sex;
		
		
	}
	
	public Penguin(){};
	
	
   public void print(){
	   
	   System.out.print("½¡¿µ£º"+super.getHealth());
		System.out.print("Ç×ÃÜ¶È£º"+super.getLove());
		System.out.print("Ãû×Ö£º"+super.getName());
		System.out.print("ÐÔ±ð£º"+super.getName());
	   
   }
			
   /*public  void cure(){
		
		System.out.print("³ÔÒ©£¬ÁÆÑø°¡");
		
	}
*/	
   public void cure(){
	   
	   this.setHealth(80);
	   System.out.print("³ÔÒ©£¬ÁÆÑø");
	   
	   
	   
	   
   }



   
   
   
   
   
	
}
