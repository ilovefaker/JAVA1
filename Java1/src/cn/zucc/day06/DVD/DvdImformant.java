package cn.zucc.day06.DVD;

import java.util.Date;

public class DvdImformant {

	protected String name;
	private Date borrowdate;
	private Date Date;
	protected String state;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBorrowdate() {
		return borrowdate;
	}
	public void setBorrowdate(Date borrowdate) {
		this.borrowdate = borrowdate;
	}
	public Date getReturndate() {
		return returndate;
	}
	public void setReturndate(Date returndate) {
		this.returndate = returndate;
	}
	public Date getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public DvdImformant(String name, Date borrowdate, Date returndate,
			String state) {
		super();
		this.name = name;
		this.borrowdate = borrowdate;
		this.returndate = returndate;
		this.state = state;
	}
	public DvdImformant() {
		super();
	}
	
	
	
	
}
