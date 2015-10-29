package cn.zucc.day07.DVD;

import java.util.Scanner;

public class DvdMenu {

	DvdManager dm=new DvdManager();
    Scanner sc=new Scanner(System.in);
	
	public void putin(DvdManager dm){
		this.dm=dm;
	
	}
	public void init(){
		System.out.println("欢迎使用迷你DVD系统");
		System.out.println("--------------------------------------------------");
		System.out.println("1.新增DVD");
		System.out.println("2.查看DVD");
		System.out.println("3.刪除DVD");
		System.out.println("4.傑出DVD");
		System.out.println("5.歸還DVD");
		System.out.println("6.退        出");
		System.out.println("--------------------------------------------------");
		System.out.println("請輸入數字選擇：");
		int num1=sc.nextInt();
		switch (num1) {
		case 1:
			System.out.println("请输入要添加的DVD名称：");
			String add = sc.next();
			Dvd dd = new Dvd("可借",add,null,null);
			dm.addDvd(dd);
			System.out.println("添加成功！");
			break;
		case 2:
			dm.search();
			break;
		case 3:	
			System.out.println("请输入要删除的DVD名称：");
			String name=sc.next();
			dm.deleteDvd(name);
			break;
		case 4:
			System.out.println("请输入要借的DVD名称：");
			String name1=sc.next();
			dm.borDvd(name1);
			break;
		case 5:
			System.out.println("请输入要还的DVD名称：");
			String name2=sc.next();
			dm.reDvd(name2);
			break;
		default:
			break;
		}
		System.out.println("按任意键返回：");
		String fanhui = sc.next();
		if(!fanhui.equals(null)){
			init();
		}
		
	}
}
