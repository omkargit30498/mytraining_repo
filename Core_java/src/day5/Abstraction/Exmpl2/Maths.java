package day5.Abstraction.Exmpl2;

public interface Maths {
	default int add() {
		int a=2;
		int b=3;
		int c=a+b;
		return c;
	}
	default int sub() {
		int z=1;
		int y=4;
		int x=y-z;
		return x;
	}
	

}
