package day8.jdbc;
import utility.*;
import java.sql.*;

public class Exmpl6 {

	public static void main(String[] args) {
		String userName="admin1";
		String passWord="456";
		
		Connection con=DButil.getmysqldbConnection();
		String sql="select * from login where username=?";
		try {
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setString(1, userName);
			ResultSet res=pst.executeQuery();
			if(res.next()){
				String res1=res.getString("password");
			if(res1.equals(passWord)) {
				System.out.println("User is valid");
			}else {
				System.out.println("user is not valid");
			}}
			else {
				System.out.println("user not found");
			}
		}catch (Exception e) {
			System.out.println("Error occured:"+e);
		}
		

	}

}
