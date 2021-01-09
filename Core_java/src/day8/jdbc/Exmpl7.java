package day8.jdbc;

import beans.Products;
import java.sql.*;
import utility.*;

public class Exmpl7 {

	public static void main(String[] args) {
		Products prdt1=new Products(1, "Mobile", 22000);
		Exmpl7 exm1= new Exmpl7();
		exm1.addproduct(prdt1);
	}
	public void addproduct(Products prd) {
		Connection con=DButil.getmysqldbConnection();
		String sql="insert into product values(?,?,?)";
		
		try {
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setInt(1,prd.getProductid());
			pst.setString(2, prd.getProuctname());
			pst.setInt(3,prd.getPrice());
			int res=pst.executeUpdate();
			if(res==0) {
				System.out.println("Querry failed");
			}else {
				System.out.println("product added");
			}
		}catch (Exception e) {
			System.out.println("Error occured"+e);
		}
		
	}

}
