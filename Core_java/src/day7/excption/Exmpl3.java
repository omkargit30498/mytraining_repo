package day7.excption;

public class Exmpl3 {
	public static void checkage(int age)throws Exception 
	{
	if (age<18) {
		throw new Exception("Access denied.");
		}
		/*whenever you add "throws" declaration to a method, you are actually deferring
		the responsibility of handling the possible exception to the caller of that method
	*/else {
		System.out.println("Access granted ,thank you");
			}	
		}


	public static void main(String[] args) {
		try{checkage(14);
		}
		catch(Exception e) {
			System.out.println("Something went wrong"+e.getMessage());
		}

	}

}
