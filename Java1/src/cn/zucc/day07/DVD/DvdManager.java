package cn.zucc.day07.DVD;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DvdManager {
	
	
	List<Dvd> list=new ArrayList<Dvd>();
	public void search(){
		System.out.println("��̖\t\t"+"��B\t\t"+"���Q\t\t�������\t\t�黹����");
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
				System.out.println("��DVD�����ڣ�");
			}else if(!"�ɽ�".equals(dvd.getState())){
				System.out.println("��DVD�ѽ��������ɾ����");
			}else{
				list.remove(dvd);
				System.out.println("ɾ���ɹ���");
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
			System.out.println("��DVD�����ڣ�");
		}else if(!"�ɽ�".equals(dvd.getState())){
			System.out.println("��DVD�ѱ�����������ٽ裡");
		}else{
			System.out.println("��ϲ���衶"+name+"���ɹ���");
			dvd.setState("�ѽ��");
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
				System.out.println("�㻹��DVD�����ڣ�����ϸ�˶�~");
			}else if("�ɽ�".equals(dvd.getState())){
				
				System.out.println("�㲢û�н����DVD��");
			}else{
				dvd.setReturnDate(date);
				dvd.setState("�ɽ�");
				dvd.setName(name);
				long Time=date.getTime()-dvd.getBorrowDate().getTime();
				long money=Time/24/60/1000/60;
				dvd.setBorrowDate(null);

				System.out.println("��ϲ�㣬����"+name+"���ɹ�����֧����"+money);
			}
		}
		
		
	}


