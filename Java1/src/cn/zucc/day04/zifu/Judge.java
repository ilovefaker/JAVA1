package cn.zucc.day04.zifu;

public class Judge {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fullName=("HelloWorld.java");
		
		String searchName=(".java");
		
		System.out.print(fullName.lastIndexOf(searchName)==fullName.length()-searchName.length());
		
		
	}

}
