package day5.setexamples;

import java.util.*;

public class Exampl2 {

	public static void main(String[] args) {
		Set<Integer> setofids=new HashSet<Integer>();
		setofids.add(12);
		setofids.add(23);
		setofids.add(32);
		setofids.add(36);
		
		Iterator<Integer> iter = setofids.iterator();
		while (iter.hasNext()) {
		int x = iter.next();
		System.out.println(x);
		}
		
	}

}
