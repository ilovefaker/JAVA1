package cn.zucc.day06.DVD;

import java.text.SimpleDateFormat;

public class DvdTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		DvdImformant dvd1 = new DvdImformant("�ѽ��", "��������ա�", sdf.parse("2010-10-01"),null);
		DvdImformant dvd2 = new DvdImformant("�ɽ�", "��������ড�", null,null);
		DvdImformant dvd3 = new DvdImformant("�ɽ�", "���������ݡ�", null,null);
		DvdManege dm = new DvdManege();
		DvdMenu dmenu = new DvdMenu();
		dm.list.add(dvd1);
		dm.list.add(dvd2);
		dm.list.add(dvd3);
		dmenu.initial(dm);
		dmenu.Menu();
	}
		
		
		
		
		
	}

}
