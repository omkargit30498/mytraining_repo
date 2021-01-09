package day3.practice;

public class Food{
	
	private String foodname;
	private int price;
	private String taste;
	
	public Food() {
		this.foodname=foodname;
		this.price=price;
		this.taste=taste;
	}

	public Food(String foodname, int price, String taste) {
		super();
		this.foodname = foodname;
		this.price = price;
		this.taste = taste;
	}

	public String getFoodname() {
		return foodname;
	}

	public void setFoodname(String foodname) {
		this.foodname = foodname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getTaste() {
		return taste;
	}

	public void setTaste(String taste) {
		this.taste = taste;
	}

	@Override
	public String toString() {
		return "Food [foodname=" + foodname + ", price=" + price + ", taste=" + taste + "]";
	}
	
	
}
