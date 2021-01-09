package day5.hashmap1;
import java.util.*;
public class Exampl3 {

	public static void main(String[] args) {
		Map<String,Double> contacts=new HashMap<String,Double>();
		contacts.put("Smith", (double) 97047690);
		contacts.put("David", (double) 878908);
		contacts.put("Stacy", (double) 8897064);
		contacts.put("Gaurav", (double) 2829030);

		//System.out.println(contacts);
		Set<String> keyst= contacts.keySet();
		for(String x:keyst) {
			double no=contacts.get(x);
			System.out.println(no);
		}

	}

}
