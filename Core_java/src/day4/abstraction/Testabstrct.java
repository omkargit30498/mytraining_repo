package day4.abstraction;

public class Testabstrct {

	public static void main(String[] args) {
		//cannot create object of abstrct
		Animal animal = new Pig();
		animal.animalSound();
		animal.sleep();
		//Animal anl= new Animal();

	}

}
