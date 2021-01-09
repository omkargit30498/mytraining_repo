package day4.inneroutter;

public class Testouter {

	public static void main(String[] args) {
		Outer myouter=new Outer();
		Outer.Inner myinner=myouter.new Inner();//also importing the inner class can create normal object
		int z=myouter.x;
		int q=myinner.y;

	}

}
