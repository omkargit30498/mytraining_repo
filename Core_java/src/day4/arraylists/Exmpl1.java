package day4.arraylists;
import java.util.ArrayList;

public class Exmpl1 {

	public static void main(String[] args) {
		ArrayList<String> cars=new ArrayList<String>();
		cars.add("Mazda");
		cars.add("Ford");
		cars.add("Audi");
		cars.add("BMW");
		
		System.out.println(cars);//printing arrlist
		System.out.println(cars.get(2));//accessing arrlist
		System.out.println("updating list:renault");
		cars.set(1, "renault");//Updating/editing arrlist
		System.out.println(cars);
		cars.remove(3);//removing particular element
		System.out.println(cars);
		System.out.println("Removing all the elements from arraylist");
		cars.clear();//clearing all elements
		System.out.println(cars);
	}

}
