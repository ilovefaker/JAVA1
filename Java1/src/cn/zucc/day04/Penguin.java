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
	   
	   System.out.print("������"+super.getHealth());
		System.out.print("���ܶȣ�"+super.getLove());
		System.out.print("���֣�"+super.getName());
		System.out.print("�Ա�"+super.getName());
	   
   }
			
   /*public  void cure(){
		
		System.out.print("��ҩ��������");
		
	}
*/	
   public void cure(){
	   
	   this.setHealth(80);
	   System.out.print("��ҩ������");
	   
	   
	   
	   
   }



   
   
   
   
   
	
}
