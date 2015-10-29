package cn.zucc.day06.Zoo;


public class Dog extends Animal implements LegNum {

	public Dog(String name,int LegNum){
		
		super(name,LegNum);
	}
	
	
	
	
	@Override
	public void show() {
		System.out.println("ÍôÍôÍô");
	}

	@Override
	public int LegNum() {
	
		
		return super.legNum;
	}

	
	
	
	
	
	
	
	
}
