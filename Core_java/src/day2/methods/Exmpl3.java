package day2.methods;

public class Exmpl3 {
	public static void sub(int a,int b) {//using static method because it is easy to call in main
	
		int c=a-b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		sub(5,3);//non static methods can be called by creating objects of the method.
	}

}
