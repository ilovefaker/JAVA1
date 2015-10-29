package cn.zucc.day07.DVD;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Dvd {
	
	private String state;
	private String name;
	private Date borrowDate;
	private Date returnDate;
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBorrowDate() {
		return borrowDate;
	}
	public void setBorrowDate(Date borrowDate) {
		this.borrowDate = borrowDate;
	}
	public Date getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}
	public Dvd() {
		super();
	}
	public Dvd(String state, String name, Date borrowDate, Date returnDate) {
		super();
		this.state = state;
		this.name = name;
		this.borrowDate = borrowDate;
		this.returnDate = returnDate;
	}
	
	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String borDate;
		String reDate;
		if(borrowDate != null){
			borDate = sdf.format(borrowDate);
		}else{
			borDate = "";
		}
		if(returnDate != null){
			reDate = sdf.format(returnDate);
		}else{
			reDate = "";
		}
		return "\t\t" + state + "\t\t" + name +"\t\t" + borDate + "\t\t" + reDate;
	}
	

}
