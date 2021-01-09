package day5.arraylists1;

import java.util.ArrayList;
import java.util.Iterator;

public class Arrofbeans {

	public static void main(String[] args) {
		Bank bk1=new Bank(9234, "Hdfc", 34556);
		Bank bk2=new Bank(8238, "IDBI", 3459);
		Bank bk3=new Bank(1939, "HSBC", 34506);
		Bank bk4=new Bank(3233, "BOI", 34558);
		
		ArrayList<Bank> bnkarr=new ArrayList<Bank>();
		bnkarr.add(bk1);
		bnkarr.add(bk2);
		bnkarr.add(bk3);
		bnkarr.add(bk4);
		
		Iterator<Bank> iter = bnkarr.iterator();
		while(iter.hasNext()) {
		Bank x = iter.next();
		System.out.println(x);
		}


		
	}

}
