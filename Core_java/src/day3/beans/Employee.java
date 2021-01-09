package day3.beans;

public class Employee {
	
	private int employeid=34566;
	private String employename="david";
	
	public Employee() {
		this.employeid=employeid;    //default constructor
		this.employename=employename;
	}
	public Employee(int employeid, String employename) {
		super();
		this.employeid = employeid;
		this.employename = employename;  //parametrized constructor
	}
	public int getEmployeid() {
		return employeid;
	}
	public void setEmployeid(int employeid) {
		this.employeid = employeid;
	}
	public String getEmployename() {
		return employename;
	}
	public void setEmployename(String employename) {
		this.employename = employename;
	}
	@Override
	public String toString() {
		return "Employee [employeid=" + employeid + ", employename=" + employename + "]";
	}
	

}
