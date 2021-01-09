package day8;

import java.util.*;

import beans.Employee;
import day7.excption.userdefinedexcption.AgenotFound;

public class Testemp {

	public static void main(String[] args) {
		Employee emp1=new Employee(1001, "Smith", 10000, 22);
		Employee emp2=new Employee(102, "Drake", 20000, 20);
		List<Employee> employee=new ArrayList<Employee>();
		
		employee.add(emp1);
		employee.add(emp2);
		
		Iterator<Employee> iter=employee.iterator();
		while(iter.hasNext()) {
			Employee emp=iter.next();
			try {
				if(emp.getAge()<18 && emp.getAge()>60) {
					employee.remove(emp);
					System.out.println("Age not valid");
				}else {
					System.out.println("Age is valid");
				}
			}catch(Exception e) {
				System.out.println("Error"+e);
			}
		}
		

	}

}
