package day3.Attributes;
import day3.beans.*;

public class Testbike {

	public static void main(String[] args) {
		
		Bike bike1=new Bike("Duke", 250, 100000);
		Bike bike2=new Bike("Pulsar",150,98000);
		Bike bike3=new Bike("R15", 200,110000);
		
		Testbike tb=new Testbike();
		Bike[] arrofbike= {bike1,bike2,bike3};
		tb.displaybike(arrofbike);
		
	}
	public void displaybike(Bike[] arr) {
		for(Bike bk:arr){
			System.out.println(bk);
		}
	}

}
