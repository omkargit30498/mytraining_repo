package day3.inheritance;

public class Test2 {

	public static void main(String[] args) {
		Vehicle obj=new Car();//an object of a child class can be stored in a reference of a parent class but not vice-versa
		obj.start();
		obj.stop();
	}

}
