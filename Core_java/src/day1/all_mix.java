package day1;

public class all_mix {

	public static void main(String[] args) {
		String name="David";
		int age=21;
		boolean voted=true;
		int vote=0;
		if (age>18) {
			if(voted) {
				vote++;
				System.out.println("Thank you for voting "+name);
					  }
		    else{
		    	System.out.println("You did not casted your vote: "+name);
		    	}
					}
		else {
			System.out.println("Not eligible to vote");
		}
		

	}

}
