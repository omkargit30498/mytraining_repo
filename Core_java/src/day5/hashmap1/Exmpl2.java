package day5.hashmap1;

import java.util.*;

public class Exmpl2 {
//map is an interface implemented as hashmap
	public static void main(String[] args) {
		Map<String,String> namecities=new HashMap<String,String>();
		
		namecities.put("pune", "Maharashtra");
		namecities.put("mumbai", "Maharashtra");
		namecities.put("Hyderabad", "Telangana");
		namecities.put("Chennai", "Tamil nadu");
		
		Set<String> Keysset=namecities.keySet();
		Iterator<String> iter = Keysset.iterator();
		while(iter.hasNext()) {
			String x=iter.next();
			String y=namecities.get(x);
			System.out.println(y);
		}

		
		
	}

}
