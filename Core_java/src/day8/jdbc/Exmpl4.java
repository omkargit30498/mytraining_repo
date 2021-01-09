package day8.jdbc;

import java.sql.*;
import utility.*;

public class Exmpl4 {

	public static void main(String[] args) {
		Connection con=DButil.getmysqldbConnection();
		String sql="insert into login values(?,?)";
		try {
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setString(1, "admin");
			pst.setString(2, "456");
			int res=pst.executeUpdate(); //this method can be used for insert/update/delete queries
			if(res==0) {
				System.out.println("Insertion failed");
			}else {
				System.out.println("Data Insertion sucessfull");
			}
		}catch (Exception e) {
			System.out.println("error"+e);
		}
		
		

	}
	

}
