package cn.zucc.day04;

public abstract  class UsbImplement implements Usb {

	public void sevice(int choose) {
		// TODO Auto-generated method stub
                
                
                switch(choose){
                
                case 1:
                	System.out.print("连接风扇成功！");break;
                case 2:
                	System.out.print("连接鼠标成功！");break;
                
                
                
                }
                
                
                
	}




	
}
