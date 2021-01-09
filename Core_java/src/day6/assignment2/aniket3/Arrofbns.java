package day6.assignment2.aniket3;

import java.util.ArrayList;
import java.util.Iterator;

public class Arrofbns {

	public static void main(String[] args) {
		Customer c1= new Customer(12, "David");
		Customer c2= new Customer(124, "Mike");
		Customer c3= new Customer(1209, "Messi");
		Customer c4= new Customer(122, "Trent");
		ArrayList<Customer> listofcust=new ArrayList<Customer>();
		listofcust.add(c1);
		listofcust.add(c2);
		listofcust.add(c3);
		listofcust.add(c4);
		Iterator<Customer> iter=listofcust.iterator();
		while(iter.hasNext()) {
			Customer x=iter.next();
			System.out.println(x);
		}
		
		
	}

}
