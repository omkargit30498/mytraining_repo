package day2.omkarExmpls;

public class exmpl3 {

	public static void main(String[] args) {
		for(int i=5;i<=50;i++) {
			if(i%3==0) {
				System.out.println("Fizz");
				
			}
			else if(i%5==0){
				System.out.println("Buzz");
			}
			else if(i%3==0 && i%5==0){
				System.out.println("FizzBuzz");
			}
			else {
				System.out.println(i);
			}
		}

	}

}
