package day2.methods;

public class Exmpl2 {
	public static void sub() {//using static method because it is easy to call in main
		int a=3;
		int b=4;
		int c=b-a;
		System.out.println(c);
	}
	public static void main(String[] args) {
		sub();//non static methods can be called by creating objects of the method.
	}

}
