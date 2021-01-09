package day4.javadates;
import java.time.*;

public class Exampl1 {

	public static void main(String[] args) {
		//Todays date
		LocalDate ld= LocalDate.now();
		System.out.println(ld);
		//current time
		LocalTime t=LocalTime.now();
		System.out.println(t);
		//date and time
		LocalDateTime dateTime=LocalDateTime.now();
		System.out.println(dateTime);

	}

}
