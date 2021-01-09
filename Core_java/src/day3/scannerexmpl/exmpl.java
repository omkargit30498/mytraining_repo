package day3.scannerexmpl;
import java.util.Scanner;

public class exmpl {

	public static void main(String[] args) {
		Scanner myObj =new Scanner(System.in);
		System.out.println("Enter username:");
		
		String name=myObj.next();
		System.out.println("Your name is:"+name);
		System.out.println("Enter age:");
		int age=myObj.nextInt();
		System.out.println("Your age is"+age);

	}

}
