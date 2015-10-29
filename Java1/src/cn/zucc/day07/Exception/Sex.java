package cn.zucc.day07.Exception;

public class Sex {

	private String name="";
	private int age=0;
	private String sex="男";
	
	public void setSex(String sex) throws Exception{
		
		if("男".equals(sex)||"女".equals(sex)){
			this.sex=sex;
		}
		
		
		else{
			
			throw new Exception("性别必须是“男”或者“女” ");
		}
		
	}
	
	public void print(){
		System.out.println(this.name+"("+this.sex+"，"+this.age+"岁)");
		
	}
	
}
