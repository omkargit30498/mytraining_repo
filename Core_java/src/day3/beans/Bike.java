package day3.beans;

public class Bike{
	private String bikename;
	private int cc;
	private int prize;
	
	public Bike(String bikename, int cc, int prize) {
		super();
		this.bikename = bikename;
		this.cc = cc;
		this.prize = prize;
	}

	public String getBikename() {
		return bikename;
	}

	public void setBikename(String bikename) {
		this.bikename = bikename;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	public int getPrize() {
		return prize;
	}

	public void setPrize(int prize) {
		this.prize = prize;
	}

	@Override
	public String toString() {
		return "Bike [bikename=" + bikename + ", cc=" + cc + ", prize=" + prize + "]";
	}
	

}
