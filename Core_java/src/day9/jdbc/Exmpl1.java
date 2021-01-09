package day9.jdbc;

import beans.Products;
import java.sql.*;

import com.mysql.cj.xdevapi.Result;

import utility.*;

public class Exmpl1 {

	public static void main(String[] args) {
		Products prdt1=new Products(1, "Mobile", 22000);
		Products prdt2=new Products(2, "Laptop", 55000);
		Products prdt3=new Products(3, "screen", 3000);
		ProductDao prd2=new ProductDao();
		Exmpl1 exm1= new Exmpl1();
		//prd2.addproduct(prdt3);
		//exm1.getallproducts();
		//prd2.getproduct(2);
		//prd2.deleteproduct(2);
		prd2.updateProduct(prdt3);
	}
	

}
