package day7.practice;

import java.io.*;
import java.util.*;
public class Bucketlist {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		Scanner sc2=new Scanner(System.in);
		System.out.println("Enter name:");
		String name=sc.nextLine();

		try {
			File file=new File(name+".txt");
			boolean res=file.createNewFile();
			if(res) {
				System.out.println("*************");
				System.out.println("Enter number of items:");
				int n=sc1.nextInt();
				FileWriter fw=new FileWriter(file);
				for(int i=0;i<n;i++) {
					System.out.println("\nEnter item "+(i+1));
					String item=sc2.nextLine();
					fw.write(item);
							
				}
				fw.close();
				System.out.println("*********************************");
				System.out.println("Following is your bucketlist..");
				Scanner read=new Scanner(file);
				while(read.hasNext()) {
					String itm=read.next();
					System.out.println(itm);
				}

				
			}
			else {
				System.out.println("File not created");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
