package cn.zucc.day04;

public abstract class Pets {

		private String name;
		private int health;
		private int love;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getHealth() {
			return health;
		}
		public void setHealth(int health) {
			this.health = health;
		}
		public int getLove() {
			return love;
		}
		public void setLove(int love) {
			this.love = love;
		}
		
		public void print(){
			System.out.print("������"+name+"������"+health+"���ܶȣ�"+love);
			
		}
	public Pets(String name,int health,int love){
		
		super();
		this.name = name;
		this.health = health;
		this.love = love;
	}
	
	public Pets() {
		super();
	}
	public abstract void cure();
	
}
