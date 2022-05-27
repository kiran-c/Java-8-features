package com.mycompany.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee[] empArr = {
				new Employee("John", 123.45),
				new Employee("Joker", 2323.67),
				new Employee("John", 23.45),
				new Employee("John", 346.87 ),
		};
		
		List<Employee> empList = Arrays.asList(empArr);
		
		
		empList.parallelStream().filter(emp  ->  emp.getSalary() > 100)
		.collect(Collectors.toList());
		
		System.out.println(empList);
		
		System.out.println("************************************");
		
		
		for(Employee emp:empList)
		{
			System.out.println("EmpName: "+emp.getEmpName()+" "+"Emp salary: "+emp.getSalary());
		}
		
		System.out.println("************************************");
		
		// it basically returns nothings , but it accepts the consumer interface
		empList.forEach(emp -> System.out.println("Emp Name: "+emp.getEmpName()+"  "+"Emp Salary: "+emp.getSalary()));
		
	}

}
