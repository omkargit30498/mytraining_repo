package day7.excption.userdefinedexcption;

public class AgenotFound extends Exception {
	public AgenotFound(){
		System.out.println("hello");
	}
	public AgenotFound(String message) {
		System.out.println(message);
	}

}
