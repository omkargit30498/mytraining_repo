package day6.assignment2.aniket3;

public class Customer {
	private int custID;
	private String custName;
	
	public Customer(){
		
	}
	public int getCustID() {
		return custID;
	}
	public void setCustID(int custID) {
		this.custID = custID;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public Customer(int custID, String custName) {
		super();
		this.custID = custID;
		this.custName = custName;
	}
	@Override
	public String toString() {
		return "Customer [custID=" + custID + ", custName=" + custName + "]";
	}
}
