package stream;

import java.util.Arrays;
import java.util.List;

public class ConvertCollectionToArray {

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee(100, "A", 1000)
				, new Employee(101, "B", 2000)
				,new Employee(102, "C", 500));
		
		// Convert List<Employee> to Employee Array
		 Employee[] empArr = employees.stream().toArray(Employee[]::new);
		 Arrays.stream(empArr).forEach(System.out::println);
	}
}
