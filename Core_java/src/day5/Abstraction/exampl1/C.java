package day5.Abstraction.exampl1;

public class C extends B implements A {

	public static void main(String[] args) {
		A a=new C();
		a.myMethod();
	}

}
