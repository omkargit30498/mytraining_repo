package day8.omkarjdbc;
import beans.*;
import utility.*;
import java.sql.*;

public class Exmpl2 {

	public static void main(String[] args) {
		Login user1=new Login("onks", "Abc@123");
		Exmpl2 exm2=new Exmpl2();
		exm2.adduser(user1);
		

	}
	public void adduser(Login user) {
		Connection con=DButil.getmysqldbConnection();
		String sql="insert into login values(?,?)";
		try {
			PreparedStatement pst =con.prepareStatement(sql);
			pst.setString(1, user.getUsername());
			pst.setString(2,user.getPassword());
			int res=pst.executeUpdate();
			if(res==0) {
				System.out.println("insertion failed");
			}else {
				System.out.println("user added");
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
