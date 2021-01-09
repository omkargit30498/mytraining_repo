package day7.practice;

public class Exmpltrycatch {

	public static void main(String[] args) {
		try {
			int a=2;
			int b=0;
			int c=a/b;
			System.out.println("division:"+c);
		}catch(ArithmeticException e) {
			System.out.println("divide by zero exception"+e);
		}

	}

}
