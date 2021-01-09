package day5.arraylists1;

public class Bank {
	private int accno=912939;
	private String name="Hdfc";
	private int balance=23456;
	public Bank(int accno, String name, int balance) {
		this.accno = accno;
		this.name = name;
		this.balance = balance;
	}
	public int getIfsc() {
		return accno;
	}
	public void setIfsc(int accno) {
		this.accno = accno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Bank [accno=" + accno + ", name=" + name + ", balance=" + balance + "]";
	}
	
	

}
