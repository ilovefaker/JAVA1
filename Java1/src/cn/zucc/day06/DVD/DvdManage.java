package cn.zucc.day06.DVD;

import java.util.Date;
import java.util.LinkedList;
import java.util.Scanner;

public class DvdManage extends DvdImformant {

	LinkedList list=new LinkedList();
	Scanner sc=new Scanner(System.in);
	public void addBook(){

            DvdImformant dvd= new DvdImformant();

            System.out.println("Ոݔ�������");
            dvd.setName(sc.next());
            dvd.setBorrowdate(" ");
            dvd.setReturndate(" ");
            dvd.setState("��߀");
	
	        list.add(dvd);
	        System.out.println("��ӳɹ���");
	}
	
	
	public void LookforBook(){
		   System.out.println("��̖��\t\t"+"����\t\t"+"��B\t\t"+"�ܳ��r�g\t\t"+"�w߀�r�g\t\t");
		   DvdImformant dvd1= new DvdImformant();
		   System.out.println("Ոݔ����ҕ�����");
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
		System.out.println("Ոݔ��h���ĕ�����");
		dvd2.setName(sc.next());
		for(int i=0;i<list.size();i++){
			
			if(name.equals(dvd2.getName())){
				
				
				list.remove(dvd2);
				
				
			}
			
			else System.out.println("�����������������~");
			
			
			
		}
		
	}
	
	
	public void BorrowBook(){
		
		System.out.println("���������鱾��");
		DvdImformant dvd3=new DvdImformant();
		dvd3.setName(sc.next());
		
		for(int i=0;i<list.size();i++){
			
			if(name.equals(dvd3.getName())&&state.equals("�ѻ�")){
			    
				dvd3.setBorrowdate(getBorrowdate());
				dvd3.setState("�ѽ�");
				System.out.println("��ϲ������ɹ���");break;
				
				
			}
			
			
			
			
		}
		
		
			
		}
	public void returnBook(){
		int money;
		System.out.println("�����뻹���鱾��");
		DvdImformant dvd4=new DvdImformant();
		dvd4.setName(sc.next());
		for(int i=0;i<list.size();i++){
			
			if(name.equals(dvd4.getName())&&state.equals("�ѽ�")){
				
				dvd4.setReturndate(getReturndate());
				Date date=new Date();
				long day=date.getTime()-dvd4.getBorrowdate().getTime();
			    
			
		}
		}
	}
	public void Back(){
		
		
		
		
	}
	
	
	
}
