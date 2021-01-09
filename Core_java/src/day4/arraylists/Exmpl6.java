package day4.arraylists;
import java.util.*;
public class Exmpl6 {

	public static void main(String[] args) {
		ArrayList<Integer> salary=new ArrayList<Integer>();
		salary.add(1000);
		salary.add(1200);
		salary.add(1300);
		salary.add(12300);
		
		Collections.sort(salary);//sorting in descending order
		Collections.sort(salary,Collections.reverseOrder());
		for(int x:salary) {
			System.out.println(x);
		}
	}

}
