package day5.setexamples;

import java.util.HashSet;
import java.util.Set;

public class Exmpl3 {

	public static void main(String[] args) {
		Set<String> countryname=new HashSet<String>();
		countryname.add("India");
		countryname.add("Australia");
		countryname.add("USA");
		countryname.add("England");
		
		for(String x:countryname) {
			System.out.println(x);
		}

		
	}

}
