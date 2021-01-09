package day6.assignment2.shruti6;

import java.util.*;

public class Hshmp {

	public static void main(String[] args) {
		Restaurant r1=new Restaurant(10, "Amol",234);
		Restaurant r2=new Restaurant(122, "Amol",234);
		Restaurant r3=new Restaurant(23, "Amol",234);
		Restaurant r4=new Restaurant(44, "Amol",234);
		
		Map<Integer,Restaurant> listofrest=new HashMap<Integer,Restaurant>();
		listofrest.put(2, r1);
		listofrest.put(3, r2);
		listofrest.put(10, r3);
		listofrest.put(25, r4);
		
		Set<Integer> keysset=listofrest.keySet();
		for(int r:keysset) {
			Restaurant rst=listofrest.get(r);
			System.out.println(r+" "+rst);
			
		}
		
		
		

		
	}

}
