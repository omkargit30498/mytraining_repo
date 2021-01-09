package day2.arrays;
//update existing value of array
public class Exmpl4 {

	public static void main(String[] args) {
		String[] cars = {"BMW", "Volvo", "Honda", "Hyundai"};
		cars[0] = "Audi";
		cars[3]="Maruti";
		for(String x:cars) {
		System.out.println(x);
		}
		

	}

}
