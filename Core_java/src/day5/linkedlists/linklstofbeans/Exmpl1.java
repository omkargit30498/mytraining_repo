package day5.linkedlists.linklstofbeans;

import java.util.LinkedList;

import day3.beans.Employee;

public class Exmpl1 {

	public static void main(String[] args) {
		Employee employee1=new Employee(1001, "Derek");
		Employee employee2=new Employee(1089, "Smith");
		Employee employee3=new Employee(1005, "Stacy");
		Employee employee4=new Employee(1004, "David");
		
		LinkedList<Employee> emplist=new LinkedList<Employee>();
		emplist.add(employee1);
		emplist.add(employee2);
		emplist.add(employee3);
		emplist.add(employee4);
		
        for(Employee emp:emplist) {
        	System.out.println(emp);
        }
        	
        
	}

}
