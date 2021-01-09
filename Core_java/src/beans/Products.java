package beans;

public class Products {
	private int productid;
	private String prouctname;
	private int price;
	public Products() {
		
	}
	public Products(int productid, String prouctname, int price) {
		super();
		this.productid = productid;
		this.prouctname = prouctname;
		this.price = price;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProuctname() {
		return prouctname;
	}
	public void setProuctname(String prouctname) {
		this.prouctname = prouctname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Products [productid=" + productid + ", prouctname=" + prouctname + ", price=" + price + "]";
	}

}
