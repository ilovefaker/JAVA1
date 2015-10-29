package cn.zucc.day07.Exception;

public class ClassNum {
	public void classsearch(int num) throws Exception{
	switch (num) {

	case 1:
		System.out.println("c#±à³Ì");
		break;
	case 2:
		System.out.println("sql");
		break;

	case 3:
		System.out.println("java");
		break;
	default:
		throw new Exception("´íÎóµÄ¿Î³Ì");
	}

	}
}
