package cn.zucc.day03;

public class addName {

	
	String[] Studentname=new String[30];
	
	
	
	public void Addname(String name){
	
		
		for(int i=0;i<Studentname.length;i++){
			if(Studentname[i]==null){
				Studentname[i]=name;break;
			}
			
			
			
						}		
						}
	
	
	
	public void Show(){
		for(int j=0;j<Studentname.length;j++){
			if(Studentname[j]==null)break;
			System.out.print("\t"+Studentname[j]);
						
			
			
		}
		
		
		
		

		
		
		
	}
	
	
	
	
	
	
	
}
