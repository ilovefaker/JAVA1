package cn.zucc.day03;

public class VipManager {

	Vip[] vips=new Vip[40];
	
	
	public void AddVip(Vip vip){
		
		for(int i=0;i<vips.length;i++){
			if(vips[i]==null){
				vips[i]=vip;
				break;
			}		
		}
	}
		
	public void show(){
		
		System.out.print("±àºÅ£º\t");
		System.out.println("»ý·Ö£º");
		for(int i=0;i<vips.length;i++){
			if(vips[i]==null){
				break;
			}
			Vip vip=vips[i];
		    System.out.print(vip.num+"\t"+vip.score);
		}	
	}	
		
		
	}
	
	
	

