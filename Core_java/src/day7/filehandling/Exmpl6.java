package day7.filehandling;

import java.io.File;

public class Exmpl6 {

	public static void main(String[] args) {
		 try {
		        File folder = new File("E:\\test2");
		        folder.mkdir();
		        boolean result = folder.exists();
		        if(result) {
		            System.out.println("Folder named "+folder.getName()+" exists");
		            System.out.println("Now we are going to delete it.");
		            folder.delete();
		            System.out.println("Deleted Successfully");
		        }else {
		            System.out.println("Folder named test1 does not exists");
		        }
		        }catch(Exception e) {
		            System.out.println("Exception Occured:"+e);
		        }

	}

}
