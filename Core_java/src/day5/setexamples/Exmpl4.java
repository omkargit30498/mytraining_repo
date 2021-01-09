package day5.setexamples;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Exmpl4 {

	public static void main(String[] args) {
		Set<String> countryname=new HashSet<String>();
		countryname.add("India");
		countryname.add("Australia");
		countryname.add("USA");
		countryname.add("England");
		
		Iterator<String> iter=countryname.iterator();
		while(iter.hasNext()) {
			String c=iter.next();
			System.out.println(c);
		}
		
		
	}

}
