package day5.setexamples.setofbeans;

import java.util.HashSet;
import java.util.Set;

import day3.beans.Employee;

public class Exmpl1 {

	public static void main(String[] args) {
		Employee employee1=new Employee(123, "Stacy");
		Employee employee2=new Employee(123, "David");
		Employee employee3=new Employee(123, "Smith");
		Employee employee4=new Employee(123, "Anuj");
		
		Set<Employee> setofemp=new HashSet<Employee>();
		setofemp.add(employee1);
		setofemp.add(employee2);
		setofemp.add(employee3);
		setofemp.add(employee4);
		for(Employee emp:setofemp) {
			System.out.println(emp);
		}

		
	}

}
