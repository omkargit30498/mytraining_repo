package day4.practice;

public interface Polygon {
	
	public void getarea();
	
	default void getSides() {
		System.out.println("I can get sides of polygon");
		
	}

}
