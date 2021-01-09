package day5.Abstraction.Exmpl2;

public class A implements Calculator,Maths{

	@Override
	public int add() {
		
		return Calculator.super.add();
	}

	@Override
	public int sub() {
		
		return Maths.super.sub();
	}
	

}
