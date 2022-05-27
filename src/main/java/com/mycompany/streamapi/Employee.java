 package com.mycompany.streamapi;

public class Employee {

	private String empName;
	private Double salary;
	
	public Employee(String empName, Double salary) {
		
		this.empName = empName;
		this.salary = salary;
	}
	
	Employee()
	{
		
	}

	public String getEmpName() {
		return empName;
	}

	public Double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", salary=" + salary + "]";
	}
	
	
	
}
