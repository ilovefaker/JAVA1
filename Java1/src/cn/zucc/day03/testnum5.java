package cn.zucc.day03;

public class testnum5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=10,y=20,z=30;
		boolean flag;
		flag=x<10||x<10;
		System.out.print("5-1"  +flag);
		flag=x>y&&y<x;
		System.out.print("5-2"  +flag);
		flag=(x<y+z)&&(x+10<=20);
		System.out.print("5-3"  +flag);
		flag=z-y==x&&(y-z)==x;
		System.out.print("5-4"  +flag);
		flag=x<10&&x>10;
		System.out.print("5-5"  +flag);
		flag=x>y||y>x;
		System.out.print("5-6"  +flag);
		flag=!(x==y)&&(x!=y)&&(x<y||y<x);
		System.out.print("5-7"  +flag);
		flag=(!(x==y))&(x!=y)&&(x<y||y<x);
		System.out.print("5-8"  +flag);
		
		
		
	}

}
