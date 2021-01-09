package day2.methods;
//here if method to be called from non-static class needs to create its object of class
public class Testexmpl6 {

	public static void main(String[] args) {
		Exmpl6 exmpl6=new Exmpl6();
		int add1=exmpl6.add(4, 5);
		int sub1=exmpl6.sub(10, 2);
		System.out.println(add1);
		System.out.println(sub1);

	}

}
