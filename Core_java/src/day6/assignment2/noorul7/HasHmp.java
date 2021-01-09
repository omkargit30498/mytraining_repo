package day6.assignment2.noorul7;

import java.util.*;

public class HasHmp {

	public static void main(String[] args) {
		SmartPhone phone1=new SmartPhone("Samsung A6", 12222);
		SmartPhone phone2=new SmartPhone("Samsung A8", 15622);
		SmartPhone phone3=new SmartPhone("Nokia A6", 16722);
		SmartPhone phone4=new SmartPhone("Samsung s20", 42222);
		
		Map<Integer,SmartPhone> listofphn =new HashMap<Integer,SmartPhone>();
		listofphn.put(3, phone1);
		listofphn.put(23, phone2);
		listofphn.put(45, phone3);
		listofphn.put(345, phone4);
		
		Set<Integer> keysset=listofphn.keySet();
		Iterator<Integer> iter=keysset.iterator();
		while(iter.hasNext()) {
			int k=iter.next();
			System.out.println(k+" "+listofphn.get(k));
		}

		
		

	}

}
