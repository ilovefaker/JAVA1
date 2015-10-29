package cn.zucc.day06.DVD;

import java.util.Date;
import java.util.LinkedList;
import java.util.Scanner;

public class DvdManage extends DvdImformant {

	LinkedList list=new LinkedList();
	Scanner sc=new Scanner(System.in);
	public void addBook(){

            DvdImformant dvd= new DvdImformant();

            System.out.println("請輸入書名：");
            dvd.setName(sc.next());
            dvd.setBorrowdate(" ");
            dvd.setReturndate(" ");
            dvd.setState("已還");
	
	        list.add(dvd);
	        System.out.println("添加成功！");
	}
	
	
	public void LookforBook(){
		   System.out.println("序號：\t\t"+"書名\t\t"+"狀態\t\t"+"傑出時間\t\t"+"歸還時間\t\t");
		   DvdImformant dvd1= new DvdImformant();
		   System.out.println("請輸入查找書名：");
		   dvd1.setName(sc.next());
		   for(int i=0;i<list.size();i++){
			   
			   if(name.equals(dvd1.getName())){
			   DvdImformant dvd=(DvdImformant) list.get(i);
			   System.out.println(i+"\t\t"+dvd.getName()+"\t\t"+dvd.getState()+"\t\t"+dvd.getBorrowdate()+"\t\t"+dvd.getReturndate());
			  
			   }		   
		   }
					
				
	}
			
	   
	public void DeleteBook(){
		  
		DvdImformant dvd2=new DvdImformant();
		System.out.println("請輸入刪除的書名：");
		dvd2.setName(sc.next());
		for(int i=0;i<list.size();i++){
			
			if(name.equals(dvd2.getName())){
				
				
				list.remove(dvd2);
				
				
			}
			
			else System.out.println("你输入的书名不存在~");
			
			
			
		}
		
	}
	
	
	public void BorrowBook(){
		
		System.out.println("请输入借的书本：");
		DvdImformant dvd3=new DvdImformant();
		dvd3.setName(sc.next());
		
		for(int i=0;i<list.size();i++){
			
			if(name.equals(dvd3.getName())&&state.equals("已还")){
			    
				dvd3.setBorrowdate(getBorrowdate());
				dvd3.setState("已借");
				System.out.println("恭喜，借书成功！");break;
				
				
			}
			
			
			
			
		}
		
		
			
		}
	public void returnBook(){
		int money;
		System.out.println("请输入还的书本：");
		DvdImformant dvd4=new DvdImformant();
		dvd4.setName(sc.next());
		for(int i=0;i<list.size();i++){
			
			if(name.equals(dvd4.getName())&&state.equals("已借")){
				
				dvd4.setReturndate(getReturndate());
				Date date=new Date();
				long day=date.getTime()-dvd4.getBorrowdate().getTime();
			    
			
		}
		}
	}
	public void Back(){
		
		
		
		
	}
	
	
	
}
