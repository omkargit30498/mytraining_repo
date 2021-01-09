package day4.interfaceeg;

public class Dog implements Animal1{
	@Override
	public void animalSound() {
	System.out.println("Bow..bow");
	}

	 @Override
	public void sleep() {
	System.out.println("zzzz...");
	}

}
