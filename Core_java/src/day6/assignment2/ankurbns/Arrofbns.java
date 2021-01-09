package day6.assignment2.ankurbns;

import java.util.ArrayList;

public class Arrofbns {

	public static void main(String[] args) {
		Airport airport1=new Airport(1, "Smith", "10am");
		Airport airport2=new Airport(1, "David", "13pm");
		Airport airport3=new Airport(1, "Mohan", "19pm");
		Airport airport4=new Airport(1, "Akash", "1am");
		ArrayList<Airport> listofairprt=new ArrayList<Airport>();
		listofairprt.add(airport1);
		listofairprt.add(airport2);
		listofairprt.add(airport3);
		listofairprt.add(airport4);
		
		for(Airport x:listofairprt) {
			System.out.println(x);
		}
		
		
	}

}
