package day5.arraylists1;

import java.util.*;

public class Arrofstrng {

	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<String>();
		Scanner sc1=new Scanner(System.in);
		Scanner sc2=new Scanner(System.in);
		System.out.println("Enter no. of entries:");
		int ent=sc1.nextInt();
		for(int y=0;y<ent;y++) {
			System.out.println("Enter name "+(y+1));
			String nm=sc2.nextLine();
			names.add(nm);
		}
		
		for (String x:names) {
			System.out.println(x);
			
		}

	}

}
