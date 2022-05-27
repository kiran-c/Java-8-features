
public class Employee {

	private String empName;
	private Double salary;
	
	public Employee(String empName, Double salary)
	{
		this.empName = empName;
		this.salary = salary;
		
	}

	public String getEmpName() {
		return empName;
	}

	public Long getSalary() {
		return salary;
	}
}
