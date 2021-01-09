package day3.Attributes;
import day3.beans.*;

public class TestStudent2 {

	public static void main(String[] args) {
		TestStudent2 stud=new TestStudent2();
		
		Student stud1=new Student(21, "David", "MBBS");
		Student stud2=new Student(22,"Smith","BE");
		Student stud3=new Student(18,"mike","MBA");
		Student stud4=new Student(23, "Ashok", "Law");
		
		Student[] arrofstud= {stud1,stud2,stud3,stud4};
		stud.displayAllStudents(arrofstud);
		
	
		}
	public void displayAllStudents(Student[] arr){
		for(Student student: arr) {
			System.out.println(student);
		}
		
	}
}
