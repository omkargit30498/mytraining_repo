package day7.thrds;

public class Testexmpl2 {

	public static void main(String[] args) {
		Exmpl2 ex2=new Exmpl2();
		Thread th=new Thread(ex2);
		th.start();

	}

}
