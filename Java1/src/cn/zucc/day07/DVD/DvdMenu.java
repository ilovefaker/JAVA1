package cn.zucc.day07.DVD;

import java.util.Scanner;

public class DvdMenu {

	DvdManager dm=new DvdManager();
    Scanner sc=new Scanner(System.in);
	
	public void putin(DvdManager dm){
		this.dm=dm;
	
	}
	public void init(){
		System.out.println("��ӭʹ������DVDϵͳ");
		System.out.println("--------------------------------------------------");
		System.out.println("1.����DVD");
		System.out.println("2.�鿴DVD");
		System.out.println("3.�h��DVD");
		System.out.println("4.�ܳ�DVD");
		System.out.println("5.�w߀DVD");
		System.out.println("6.��        ��");
		System.out.println("--------------------------------------------------");
		System.out.println("Ոݔ�딵���x��");
		int num1=sc.nextInt();
		switch (num1) {
		case 1:
			System.out.println("������Ҫ��ӵ�DVD���ƣ�");
			String add = sc.next();
			Dvd dd = new Dvd("�ɽ�",add,null,null);
			dm.addDvd(dd);
			System.out.println("��ӳɹ���");
			break;
		case 2:
			dm.search();
			break;
		case 3:	
			System.out.println("������Ҫɾ����DVD���ƣ�");
			String name=sc.next();
			dm.deleteDvd(name);
			break;
		case 4:
			System.out.println("������Ҫ���DVD���ƣ�");
			String name1=sc.next();
			dm.borDvd(name1);
			break;
		case 5:
			System.out.println("������Ҫ����DVD���ƣ�");
			String name2=sc.next();
			dm.reDvd(name2);
			break;
		default:
			break;
		}
		System.out.println("����������أ�");
		String fanhui = sc.next();
		if(!fanhui.equals(null)){
			init();
		}
		
	}
}
