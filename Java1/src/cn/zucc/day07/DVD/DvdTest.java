package cn.zucc.day07.DVD;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DvdTest {


	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Dvd dvd1 = new Dvd("�ѽ��","�������",sdf.parse("2010-11-25"),null);
		Dvd dvd2 = new Dvd("�ɽ�","�������",null,null);
		Dvd dvd3 = new Dvd("�ɽ�","��������",null,null);
	    DvdManager dm = new DvdManager();
	    dm.list.add(dvd1);
	    dm.list.add(dvd2);
	    dm.list.add(dvd3);
	    DvdMenu du=new DvdMenu();
	    du.putin(dm);
	    du.init();
	

		
		
		
}
}