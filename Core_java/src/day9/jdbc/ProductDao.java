package day9.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import beans.Products;
import utility.DButil;

public class ProductDao {
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
				System.out.println("product did not add");
			}else {
				System.out.println("product added");
			}
		}catch (Exception e) {
			System.out.println("Error occured"+e);
		}
		
	}public void getallproducts() {
		Connection con=DButil.getmysqldbConnection();
		String sql="select * from product";
		try {
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()) {
				int id=rs.getInt("product_id");
				String name=rs.getString("product_name");
				int price=rs.getInt("price");
				System.out.println("productid:"+id);
				System.out.println("product name:"+name);
				System.out.println("price"+price);
				System.out.println("***********************");
			}
		}catch (Exception e) {
			System.out.println("error occured"+e);
		}
	}public void getproduct(int id) {
		Connection con=DButil.getmysqldbConnection();
		String sql="select * from product where product_id=?";
		try {
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setInt(1, id);
			ResultSet rs=pst.executeQuery();
			if(rs.next()) {
				String name=rs.getString("product_name");
				System.out.println("product id:"+id);
				System.out.println("Product name:"+name);
				int price=rs.getInt("price");
				System.out.println("price:"+price);
			}else {
				System.out.println("product id doesnot exist");
			}
			
		}catch (Exception e) {
			System.out.println("Error occured:"+e);
		}
	}
	public void deleteproduct(int id) {
		Connection con=DButil.getmysqldbConnection();
		String sql="delete from product where product_id=?";
		try {
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setInt(1, id);
			int res=pst.executeUpdate();
			if(res==0) {
				System.out.println("Product not found ");
				System.out.println("Product removing failed");
			}else {
				System.out.println("product removed successfully");
			}
		}catch (Exception e) {
			System.out.println("error"+e);
		}
	}public void updateProduct(Products product) {
		Connection con=DButil.getmysqldbConnection();
		String sql="update product set product_name=?, price=? where product_id=?";
		try{
			PreparedStatement pst =con.prepareStatement(sql);
			pst.setString(1, product.getProuctname());
			pst.setInt(2, product.getPrice());
			pst.setInt(3, product.getProductid());
			int res=pst.executeUpdate();
			if(res==0) {
				System.out.println("Product not found");
			}else {
				System.out.println("product updated");
			}
			
		}catch (Exception e) {
			System.out.println("error occured:"+e);
		}
	}

}
