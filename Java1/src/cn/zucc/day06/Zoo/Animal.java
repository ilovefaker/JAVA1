package cn.zucc.day06.Zoo;

import javax.annotation.Resource;

public abstract class Animal {

    private String name;
	int legNum;	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLegNum() {
		return legNum;
	}
	public void setLegNum(int legNum) {
		this.legNum = legNum;
	}


	public Animal(String name, int legNum) {
		super();
		this.name = name;
		this.legNum = legNum;
	}
	public Animal() {
		super();
	}
	public abstract void show();
	
	@Resource
	public String toString(){
		return name+"\t\t";
		
		
		
		
		
	}

	
}
