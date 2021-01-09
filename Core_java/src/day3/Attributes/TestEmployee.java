package day3.Attributes;
import day3.beans.*;

public class TestEmployee {

	public static void main(String[] args) {
		Employee employee=new Employee();
		System.out.println(employee.getEmployeid());
		System.out.println(employee.getEmployename());
		
		System.out.println("updating values of employee object..");
		
		employee.setEmployeid(8007);
		employee.setEmployename("Cary");
		System.out.println(employee.getEmployeid());
		System.out.println(employee.getEmployename());
		
		System.out.println("updating values using parameterized constructor");
		Employee employe2=new Employee(3304,"Smith");
		System.out.println(employe2.getEmployeid());
		System.out.println(employe2.getEmployename());
		
		System.out.println(employe2);
		//bean class should have:private attributes,parameterized constructors,toString method,public getrs and setrs
	}

}
