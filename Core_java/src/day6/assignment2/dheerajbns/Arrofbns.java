package day6.assignment2.dheerajbns;

import java.util.ArrayList;

public class Arrofbns {

	public static void main(String[] args) {
		Account acc1= new Account(10034, "Ashok");
		Account acc2= new Account(10434, "Nikhil");
		Account acc3= new Account(12034, "Manav");
		Account acc4= new Account(15734, "Mira");
		
		ArrayList<Account> listofacc=new ArrayList<Account>();
		listofacc.add(acc1);
		listofacc.add(acc2);
		listofacc.add(acc3);
		listofacc.add(acc4);
		for (int i=0;i<listofacc.size();i++) {
			System.out.println(listofacc.get(i));
		}

		

	}

}
