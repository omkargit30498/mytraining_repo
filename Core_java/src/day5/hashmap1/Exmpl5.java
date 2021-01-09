package day5.hashmap1;

import java.util.*;

public class Exmpl5 {
//using iterator for display
	public static void main(String[] args) {
		HashMap<Integer, Integer> accno=new HashMap<Integer,Integer>();
		accno.put(1, 93456730);
		accno.put(2, 939567030);
		accno.put(3, 9394530);
		accno.put(4, 93933330);
	
		//System.out.println(accno);
		Set<Integer> keysset=accno.keySet();
		Iterator<Integer> iter=keysset.iterator();
		while(iter.hasNext()) {
			int p=iter.next();
			int x=accno.get(p);
			System.out.println(x);
		}
	}

}
