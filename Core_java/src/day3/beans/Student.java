package day3.beans;

public class Student {
	private int rollno;
	private String studname;
	private String course;
	public Student(int rollno, String studname, String course) {
		super();
		this.rollno = rollno;
		this.studname = studname;
		this.course = course;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getStudname() {
		return studname;
	}
	public void setStudname(String studname) {
		this.studname = studname;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", studname=" + studname + ", course=" + course + "]";
	}
	

}
