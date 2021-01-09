package day7.filehandling;

import java.io.*;

public class Exmpl5 {

	public static void main(String[] args) {
		File file=new File("myfile.txt");
		boolean res=file.exists();
		if(res) {
			System.out.println("File exists");
			System.out.println("now deleting file..");
			boolean res2=file.delete();
			if(res2) {
				System.out.println("File deleted successfully..");
			}else {
				System.out.println("file deletion failed");
			}
		}else {
			System.out.println("file doesnt exists");
		}

	}

}
