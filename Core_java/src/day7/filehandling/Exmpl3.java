package day7.filehandling;

import java.io.*;

public class Exmpl3 {

	public static void main(String[] args) {
		try {
			FileWriter mywriter=new FileWriter("file1.txt");
			for(int i=0;i<3;i++) {mywriter.write("File content\n"+i);}
			mywriter.close();
			System.out.println("succesfully wrote to a file");
		}catch (Exception e) {
			System.out.println("Exception occurred:"+e);
		}

	}

}
