package day9.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import beans.Students;
import utility.DButil;

public class StudentDao {
	
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
	public void getStudentnm(String name) {
		Connection con =DButil.getmysqldbConnection();
		String sql="select * from student where student_name=?";
		try {
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setString(1, name);
			ResultSet rs=pst.executeQuery();
			if(rs.next()) {
				System.out.println("Student found ");
				System.out.println("************************");
				int id=rs.getInt("roll_number");
				System.out.println(id);

				String course=rs.getString("course");
				System.out.println(course);

				int du=rs.getInt("duration");
				System.out.println(du);

				int age=rs.getInt("age");
				System.out.println(age);

			}else {
				System.out.println("Student not found");
			}
		}catch(Exception e) {
			System.out.println("Error occured:"+e);
		}
	}public void deletStud(int rollno) {
		Connection con=DButil.getmysqldbConnection();
		String sql="delete from student where roll_number=?";
		try {
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setInt(1, rollno);
			int res=pst.executeUpdate();
			if(res==0) {
				System.out.println("Student not found");
			}else {
				System.out.println("Student removed successfully");
			}
		}catch (Exception e) {
			System.out.println("error occurred"+e);
		}
	}public void updateStudent(Students stud) {
		Connection con=DButil.getmysqldbConnection();
		String sql="update student set student_name=?,course=?,age=? where roll_number=?";
		try {
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setString(1, stud.getStudname());
			pst.setString(2,stud.getCourse());
			pst.setInt(3, stud.getAge());
			pst.setInt(4, stud.getRollNumbers());
			int res=pst.executeUpdate();
			if(res==0) {
				System.out.println("Student not found");
			}else {
				System.out.println("Student updated");
			}
		}catch (Exception e) {
			System.out.println("Error"+e);
		}
	}

}
