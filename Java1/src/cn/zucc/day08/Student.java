package cn.zucc.day08;

public class Student {

	private String name;
	private String SAddress;
	private String SEmail;
	private String SGrade;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSAddress() {
		return SAddress;
	}
	public void setSAddress(String sAddress) {
		SAddress = sAddress;
	}
	public String getSEmail() {
		return SEmail;
	}
	public void setSEmail(String sEmail) {
		SEmail = sEmail;
	}
	public String getSGrade() {
		return SGrade;
	}
	public void setSGrade(String string) {
		SGrade = string;
	}
	@Override
	public String toString() {
		return "Student [SAddress=" + SAddress + ", SEmail=" + SEmail
				+ ", SGrade=" + SGrade + ", name=" + name + "]";
	}
	
	
	
}
