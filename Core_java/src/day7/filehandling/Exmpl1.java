package day7.filehandling;

import java.io.*;

public class Exmpl1 {
	
	public static void main(String[] args) {
		try {
			File myobj=new File("myfile.txt");
			boolean result=myobj.createNewFile();
			if(result) {
				System.out.println("File created successfully");
			}else {
				System.out.println("File already exist");
			}
		}
		catch (Exception e) {
			System.out.println("Exception occurred"+e);
		}
	}

}
