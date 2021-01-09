package day7.practice;

public class Inputexception extends Exception{
	public Inputexception(){
		System.out.println("incorrect input");
	}
	public Inputexception(String s) {
		System.out.println(s);
	}

}
