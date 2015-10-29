package cn.zucc.day04.jiekouHomework;

public interface UserDor {
	
	User user = new User();

	public User findName(String name);
	public String addName(User user);
	public String changeName(User user);
	
	
	
}
