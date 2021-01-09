package day4.arraylists;
import java.util.*;
public class Exmpl4 {

	public static void main(String[] args) {
		ArrayList<Integer> salary=new ArrayList<Integer>();
		salary.add(1000);
		salary.add(1200);
		salary.add(1200);
		salary.add(1200);
		for(int x:salary) {
			System.out.println(x);
		}
	}

}
