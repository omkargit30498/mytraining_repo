package day7.excption;

public class Exmpl1 {

	public static void main(String[] args) {
		try {
			int[] mylist= {1,2,4};
			System.out.println(mylist[2]);
		}
		catch(Exception e){
			System.out.println("Something went wrong");
		}
		finally {
			System.out.println("this is finally block");
		}

	}

}
