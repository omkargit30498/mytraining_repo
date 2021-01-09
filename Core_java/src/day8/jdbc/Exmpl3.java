package day8.jdbc;

import java.sql.*;

public class Exmpl3 {

	public static void main(String[] args) {
		Connection con=getmysqldbConnection();
		String sql="insert into login values('frontdesk','0123')";
		try {
			Statement st=con.createStatement();
			int res=st.executeUpdate(sql); //this method can be used for insert/update/delete queries
			if(res==0) {
				System.out.println("Insertion failed");
			}else {
				System.out.println("Insertion sucessfull");
			}
		}catch (Exception e) {
			System.out.println("error"+e);
		}
		
		

	}
	public static Connection getmysqldbConnection() {
		String driverClassname="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/java_training";
		String dbusername="root";
		String dbpassword="root";
		Connection con=null;
		
		try {
			Class.forName(driverClassname);
			con=DriverManager.getConnection(url, dbusername,dbpassword);
		}catch (Exception e) {
			System.out.println("Error occured"+e);
		}
		return con;
	}

}
