package day2.omkarExmpls;

public class Mytest3 {

	public static void main(String[] args) {
		int[] salaries = { 20000, 25000, 55000, 47000, 38000 };
		int salaryToFind = 55000;
		for(int i=0;i<salaries.length;i++) {
			int sal=salaries[i];
			if(sal==salaryToFind) {
				System.out.println("Found at:"+i);
			}
			else {
				System.out.println("");
			}
		}


	}

}
