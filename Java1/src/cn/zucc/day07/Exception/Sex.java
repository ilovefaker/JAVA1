package cn.zucc.day07.Exception;

public class Sex {

	private String name="";
	private int age=0;
	private String sex="��";
	
	public void setSex(String sex) throws Exception{
		
		if("��".equals(sex)||"Ů".equals(sex)){
			this.sex=sex;
		}
		
		
		else{
			
			throw new Exception("�Ա�����ǡ��С����ߡ�Ů�� ");
		}
		
	}
	
	public void print(){
		System.out.println(this.name+"("+this.sex+"��"+this.age+"��)");
		
	}
	
}
