package cn.zucc.day03;

public class StudentList {

	String[] name2=new String[30];
	int i=0;
	public void addname(String name){
		
		if(name2[i]==null)
	     name2[i]=name;		
	}
	
	public void Show(){
		
		System.out.print("����ѧ���б�");
		for(int j=0;j<i;j++){
			
			System.out.print(name2[j]+"\t");
			
		}
		
	}
	
	public void  findStu(int start,int end,String name){		
		String flag ="false";
			for(int i=start-1;i<end;i++){
				   String stu =stus[i];			   
				if(name.equals(stu.name)){
						System.out.print("�鵽��ѧ��");
						flag ="true";   
					   	break;
				}	     
			}   	
				if(flag.equals("false"))
					   System.out.print("δ�鵽��ѧ��");
	
	
	
}
