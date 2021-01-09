package day4.arraylists;
import java.util.ArrayList;
public class Exmpl2 {

	public static void main(String[] args) {
		ArrayList<String> cars=new ArrayList<String>();
		cars.add("Mazda");
		cars.add("Ford");
		cars.add("Audi");
		cars.add("BMW");
		
		for(String x:cars) {
			System.out.println(x);
		}
		
	}

}
