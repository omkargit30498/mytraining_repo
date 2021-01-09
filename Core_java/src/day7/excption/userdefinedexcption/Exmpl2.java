

package day7.excption.userdefinedexcption;

public class Exmpl2 {
	static void checkage(int age)throws AgenotFound
	{
	if (age<18){
		throw new AgenotFound("Access denied");}
		/*whenever you add "throws" declaration to a method, you are actually deferring
		the responsibility of handling the possible exception to the caller of that method
	*/else {
		System.out.println("Access granted ,thank you");
			}	
		}


	public static void main(String[] args) {
		try{checkage(12);}
		catch (AgenotFound e) {
			e.printStackTrace();
		}

	}

}
