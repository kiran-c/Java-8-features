import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee[] empArr = {
				
				new Employee("John", 32423.34),
				new Employee("Jaffer", 32423.34),
				new Employee("Joker", 32423.34),
				new Employee("Jary", 123.2312),
		
		};
		
		List<Employee> empList = Arrays.asList(empArr);
		empList.parallelStream()
		.filter(emp -> {
			return emp.getSalary() > 20000.00;
			
		}).collect(Collectors.toList());
		
	}

}
