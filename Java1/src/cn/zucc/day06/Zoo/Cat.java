package cn.zucc.day06.Zoo;

public class Cat extends Animal implements LegNum{

	public Cat(String name,  int LegNum) {
		super(name, LegNum);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void show() {
		System.out.println("ίχίχίχ");
		
	}

	@Override
	public int LegNum() {
		
		return super.getLegNum();
	}

   


	
	
}
