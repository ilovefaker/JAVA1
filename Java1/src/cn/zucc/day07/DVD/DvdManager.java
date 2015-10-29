package cn.zucc.day07.DVD;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DvdManager {
	
	
	List<Dvd> list=new ArrayList<Dvd>();
	public void search(){
		System.out.println("序號\t\t"+"狀態\t\t"+"名稱\t\t借出日期\t\t归还日期");
		int i = 0;
		for (Dvd dvd:list) {
			i++;
			System.out.print(i);
			System.out.println(dvd);
		}
	}
	
	public void addDvd(Dvd dd){
		list.add(dd);
	}
	
	public void deleteDvd(String name){
		Dvd dvd = null;
		for (int i=0;i<list.size();i++){
			if(name.equals(list.get(i).getName())){
				dvd = list.get(i);
			}
		}
			if(dvd==null){
				System.out.println("该DVD不存在！");
			}else if(!"可借".equals(dvd.getState())){
				System.out.println("该DVD已借出，不能删除！");
			}else{
				list.remove(dvd);
				System.out.println("删除成功！");
			}
			
		
		
	}
	
	public void borDvd(String name){
		Date date=new Date();
		Dvd dvd=null;
		for(int i=0;i<list.size();i++){
			if(name.equals(list.get(i).getName())){
				dvd=list.get(i);
			}			
		}
		if(dvd==null){
			System.out.println("该DVD不存在！");
		}else if(!"可借".equals(dvd.getState())){
			System.out.println("该DVD已被借出，不能再借！");
		}else{
			System.out.println("恭喜，借《"+name+"》成功！");
			dvd.setState("已借出");
			dvd.setBorrowDate(date);
		}
		
		
	}
	
	public void reDvd(String name){
		Date date=new Date();
		Dvd dvd=null;
		for (int i = 0; i < list.size(); i++) {
			if(name.equals(list.get(i).getName())){
				dvd=list.get(i);
			}
		}
			if(dvd==null){
				System.out.println("你还的DVD不存在！请仔细核对~");
			}else if("可借".equals(dvd.getState())){
				
				System.out.println("你并没有借这个DVD！");
			}else{
				dvd.setReturnDate(date);
				dvd.setState("可借");
				dvd.setName(name);
				long Time=date.getTime()-dvd.getBorrowDate().getTime();
				long money=Time/24/60/1000/60;
				dvd.setBorrowDate(null);

				System.out.println("恭喜你，还《"+name+"》成功！请支付："+money);
			}
		}
		
		
	}


