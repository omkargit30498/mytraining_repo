package day5.arraylists1;

import java.util.*;

public class Arrofint {

	public static void main(String[] args) {
		ArrayList<Integer> Khatabok=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of entries:");
		int entries=sc.nextInt();
		for (int i=1;i<=entries;i++) {
			System.out.println("Enter entry "+i);
			int ent=sc.nextInt();
			Khatabok.add(ent);
			
		}
		
		for (int x:Khatabok) {
			System.out.println(x);
			
		}

	}

}
