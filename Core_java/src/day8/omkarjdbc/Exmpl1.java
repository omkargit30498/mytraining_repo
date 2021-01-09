package day8.omkarjdbc;

import beans.Students;
import utility.DButil;
import java.sql.*;

import com.mysql.cj.xdevapi.DbDoc;

public class Exmpl1 {

	public static void main(String[] args) {
		Students stud1=new Students(113, "Smith", "B.E", 13, 21);
		Exmpl1 exm1=new Exmpl1();
		//exm1.addStudent(stud1);
		//exm1.showStudents();
		exm1.findStudent(13);

	}
	
	public void addStudent(Students stud) {
		Connection con=DButil.getmysqldbConnection();
		String sql="insert into student values(?,?,?,?,?)";
		try {
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setInt(1, stud.getRollNumbers());
			pst.setString(2, stud.getStudname());
			pst.setString(3, stud.getCourse());
			pst.setInt(4, stud.getDuration());
			pst.setInt(5, stud.getAge());
			int res=pst.executeUpdate();
			System.out.println(res);
			if(res==0) {
				System.out.println("insertion failed");
			}else {
				System.out.println("Student added");
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}public void showStudents() {
		Connection con=DButil.getmysqldbConnection();
		String sql="select * from student";
		try {
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			int i=1;
			while(rs.next()) {
				
				System.out.println("Student:"+i);
				int rollno=rs.getInt("roll_number");
				String name=rs.getString("student_name");
				String course=rs.getString("course");
				int age=rs.getInt("age");
				System.out.println("Rollno:"+rollno);
				System.out.println("Name:"+name);
				System.out.println("Course:"+course);
				System.out.println("Age:"+age);
				System.out.println("***********************");
				i++;
			}
		}catch (Exception e) {
			System.out.println("Error occured:"+e);
		}
	}public void findStudent(int rollno) {
		Connection con=DButil.getmysqldbConnection();
		String sql="select * from student where roll_number=?";
		try {
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setInt(1, rollno);
			ResultSet rs=pst.executeQuery();
			if(rs.next()) {
				System.out.println("Student found ");
				System.out.println("************************");
				String name=rs.getString("student_name");
				System.out.println(name);

				String course=rs.getString("course");
				System.out.println(course);

				int du=rs.getInt("duration");
				System.out.println(du);

				int age=rs.getInt("age");
				System.out.println(age);

				
			}else {
				System.out.println("Student not found");
			}
			
		}catch (Exception e) {
			System.out.println("error occured"+e);
		}
			
		
	}

}
