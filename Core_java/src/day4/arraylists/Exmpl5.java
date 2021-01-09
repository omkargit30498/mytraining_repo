package day4.arraylists;
import java.util.*;
public class Exmpl5 {
	
	public static void main(String[] args) {
		ArrayList<String> city=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<=3;i++) {
			System.out.println("Enter the name of city");
			String cityname=sc.nextLine();
			city.add(cityname);
			
		}
		System.out.println(city);

	}

}
