package day5.setexamples;

import java.util.HashSet;
import java.util.Set;

public class Exampl1 {

	public static void main(String[] args) {
		Set<Integer> setofids=new HashSet<Integer>();
		setofids.add(12);
		setofids.add(23);
		setofids.add(32);
		setofids.add(36);
		for(int x:setofids) {
			System.out.println(x);
		}
		
	}

}
