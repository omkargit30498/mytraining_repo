package day4.arraylists;
import java.util.*;
public class Exmpl3 {

	public static void main(String[] args) {
		ArrayList<String> cars=new ArrayList<String>();
		cars.add("Mazda");
		cars.add("Ford");
		cars.add("Audi");
		cars.add("BMW");
		Iterator<String> iter = cars.iterator();
		while(iter.hasNext()) {
		String x = iter.next();
		System.out.println(x);
		}
		//in java Class name starts with capital and method name starts with small letter
		
	}

}
