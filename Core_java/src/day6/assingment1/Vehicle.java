package day6.assingment1;

public interface Vehicle {
  default void feature() {
	  System.out.println("Rides the different vehicles");
	  //here iam using default method to implement in interface itself.
  } 

}
