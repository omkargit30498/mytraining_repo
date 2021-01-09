package day7.excption;

public class Exmpl2 {
	static void checkage(int age) 
	{
	if (age<18) {
		throw new ArithmeticException("Access denied");}
		/*whenever you add "throws" declaration to a method, you are actually deferring
		the responsibility of handling the possible exception to the caller of that method
	*/else {
		System.out.println("Access granted ,thank you");
			}	
		}


	public static void main(String[] args) {
		checkage(19);

	}

}
