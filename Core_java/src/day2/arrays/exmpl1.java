package day2.arrays;

//array of string values 
public class exmpl1 {

	public static void main(String[] args) {
		String[] cars= {"Volvo","Mazda","Honda","Hyundai"};
		/*System.out.println(cars[0]);
		System.out.println(cars[1]);
		System.out.println(cars[2]);
		System.out.println(cars[3]);
		
		for(int i=0;i<cars.length;i++) {
			String y=cars[i];
			System.out.println(y);
		}*/
		
		for(String c:cars) {
			System.out.println(c);
		}// used only for collection of objects for e.g string , donot use for integer type.
		
		

	}

}
