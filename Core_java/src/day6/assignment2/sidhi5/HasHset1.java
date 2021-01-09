package day6.assignment2.sidhi5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HasHset1 {

	public static void main(String[] args) {
		States st1=new States(123, "pune");
		States st2=new States(144, "Nashik");
		States st3=new States(056, "Mumbai");
		States st4=new States(102, "Satara");
		
		Set<States> listofst=new HashSet<States>();
		listofst.add(st1);
		listofst.add(st2);
		listofst.add(st3);
		listofst.add(st4);
		Iterator<States> iter=listofst.iterator();
		while(iter.hasNext()) {
			States s=iter.next();
			System.out.println("Citycode:"+s.getCityCode());
			System.out.println("City name:/n"+s.getCity());
		}


	}

}
