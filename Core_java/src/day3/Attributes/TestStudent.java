package day3.Attributes;
import day3.beans.*;

public class TestStudent {

	public static void main(String[] args) {
		
		Student student1=new Student(21, "David", "MBBS");
		System.out.println(student1);
		
		Student stud2=new Student(22,"Smith","BE");
		Student stud3=new Student(18,"mike","MBA");
		Student stud4=new Student(23, "Ashok", "Law");
		System.out.println(stud2);
		System.out.println(stud3);
		System.out.println(stud4);
		
		

	}

}
