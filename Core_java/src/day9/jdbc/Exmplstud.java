package day9.jdbc;

import beans.Students;
import utility.DButil;
import java.sql.*;

import com.mysql.cj.xdevapi.DbDoc;

public class Exmplstud {

	public static void main(String[] args) {
		Students stud1=new Students(113, "Smith", "B.E", 13, 21);
		Students Stud2=new Students(114,"Manoj","M.tech",12,22);
		Students Stud3=new Students(114,"Smitesh","M.B.A",2,20);
		Students Stud4=new Students(115,"Riyans","preprimary",2,30);
		
		StudentDao studentDao=new StudentDao();
		
		//studentDao.addStudent(Stud4);
		//studentDao.deletStud(112);
		studentDao.updateStudent(Stud4);
	}
	
	

}
