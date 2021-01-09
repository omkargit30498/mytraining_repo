package day8.jdbc;

import java.sql.*;

//jdbc demo using prepareStatement
//Statement cannot take input while prepared statement can take input parameters
public class Exmpl2 {
	
	public static void main(String[] args) {
		String driverClassname="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/java_training";
		String dbusername="root";
		String dbpassword="root";
		
		try {
			Class.forName(driverClassname);
			Connection con=DriverManager.getConnection(url, dbusername,dbpassword);
			System.out.println("Connection:"+con);
			
			String sql="select * from login";
			// Statement or PreparedStatement
			// First giving demo using Statement
			PreparedStatement pst=con.prepareStatement(sql);//Statement is used when we want to execute query onces and by using PreparedStatement we can execute the query multiple times.
			ResultSet rs=pst.executeQuery();// for select queries, we use executeQury() method
			while(rs.next()) {
				String username=rs.getString("username");
				String password=rs.getString("password");
				System.out.println("username:"+username);
				System.out.println("password:"+password);
				System.out.println("***********************");
			}
			
			
		}catch(Exception e){
			System.out.println("Error occured"+e);
		}
		
		
		
	}

}
