package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSorted {

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee(100, "A", 1000), new Employee(101, "B", 2000),
				new Employee(102, "C", 500));
		// It works for only comparable object
		employees = employees.stream().sorted().collect(Collectors.toList());
		System.out.println(employees);
		
		// It works for both comparable and non-comparable object
		employees = employees.stream().sorted((e1, e2)-> e1.getName().compareTo(e2.getName()))
				.collect(Collectors.toList());
		System.out.println(employees);
	}
}
