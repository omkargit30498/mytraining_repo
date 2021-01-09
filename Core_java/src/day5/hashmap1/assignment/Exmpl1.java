package day5.hashmap1.assignment;
import java.util.*;

import day3.beans.Employee;
public class Exmpl1 {

	public static void main(String[] args) {
		/*
		  Write a class in which in main method, you create a
Map<Integer, Employee> . Key you can take as employeeId
and value will be Employee object.
Then write code to display it in both styles:
1) with for-each loop
2) with Iterator*/
		Employee emp1=new Employee(1002, "Ashok");
		Employee emp2=new Employee(1010, "Raju");
		Employee emp3=new Employee(1023, "Amar");
		Employee emp4=new Employee(1034, "Nikhil");

		Map<Integer,Employee> employee=new HashMap<Integer,Employee>();
		employee.put(102, emp1);
		employee.put(124, emp2);
		employee.put(123, emp3);
		employee.put(34, emp4);
		
		Set<Integer>keysset=employee.keySet();
		Iterator<Integer> iter=keysset.iterator();
		while(iter.hasNext()) {
			int x=iter.next();
			Employee emp=employee.get(x);
			System.out.println(x+" "+emp);
		}
		
		
	}

}
