package day7.practice;
import java.util.*;

public class Testexmpl {
	static void input(String name)throws Inputexception {
		if(name.length()<1) {
			throw new Inputexception("Invalid input");
		}
		else {
			System.out.println("Valid input");
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter name:");
			input(sc.nextLine());
			
		}catch (Inputexception e) {
			e.printStackTrace();
		}
		sc.close();

	}

}
