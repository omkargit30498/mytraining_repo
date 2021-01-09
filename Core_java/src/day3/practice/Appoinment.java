package day3.practice;

public class Appoinment {

	public static void main(String[] args){
		
		Doctors d=new Doctors();
		d.treatment();
		Surgeon d1=new Surgeon();//why cant superclass obj cant access methods explicitly
		
		Dentist d2=new Dentist();
		
		d1.treatment();
		int Surgcontact=d1.contact();
		System.out.println(Surgcontact);
		d2.treatment();
		int Dentcontact=d2.contact();
		System.out.println(Dentcontact);
		
		
		
	

	}

}
