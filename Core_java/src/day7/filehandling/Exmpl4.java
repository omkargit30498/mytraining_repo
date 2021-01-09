package day7.filehandling;

import java.io.File;
import java.util.Scanner;

public class Exmpl4 {

	public static void main(String[] args) {
		try {
			File file=new File("file1.txt");
			Scanner read1=new Scanner(file);
			while(read1.hasNext()) {
				String d=read1.nextLine();
				System.out.println(d);
			}read1.close();
		}catch (Exception e) {
			System.out.println( "exception occurred"+e);
		}

	}

}
