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
		
		System.out.print("������"+super.getHealth());
		System.out.print("���ܶȣ�"+super.getLove());
		System.out.print("���֣�"+super.getName());
		System.out.print("Ʒ�֣�"+strain);
		
		
		
	}
	
	/*public  void cure(){
		
		System.out.print("���룬��Ӵ��");
		
	}*/
	
	public void cure(){
		this.setHealth(70);
		System.out.print("���룬��ҩ");
		
	}
}
