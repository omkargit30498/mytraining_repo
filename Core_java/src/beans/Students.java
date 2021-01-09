package beans;

public class Students {
	private int rollNumbers;
	private String studname;
	private String course;
	private int duration;
	private int age;
	public Students() {
		
	}
	public Students(int rollNumbers, String studname, String course, int duration, int age) {
		super();
		this.rollNumbers = rollNumbers;
		this.studname = studname;
		this.course = course;
		this.duration = duration;
		this.age = age;
	}
	public int getRollNumbers() {
		return rollNumbers;
	}
	public void setRollNumbers(int rollNumbers) {
		this.rollNumbers = rollNumbers;
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
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Students [rollNumbers=" + rollNumbers + ", studname=" + studname + ", course=" + course + ", duration="
				+ duration + ", age=" + age + "]";
	}
	

}
