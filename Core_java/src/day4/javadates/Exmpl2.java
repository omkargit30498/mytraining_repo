package day4.javadates;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class Exmpl2 {

	public static void main(String[] args) {
		//Date formator
		LocalDateTime myDateObj = LocalDateTime.now();
		System.out.println("Before formatting: " + myDateObj);
		
		DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String Formatdatetime=myDateObj.format(formatter);
		System.out.println("After Formating: "+Formatdatetime);

	}

}
