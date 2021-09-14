package stream.advance;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import stream.Employee;

public class StreamGroupingBy {

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee(100, "A", 1000), new Employee(101, "B", 2000),
				new Employee(102, "C", 500), new Employee(101, "D", 300));

		Map<Integer, List<Employee>> map = employees.stream().collect(Collectors.groupingBy(Employee::getId));
		System.out.println(map);
		
		Map<Character, List<Employee>> map1 = employees.stream().collect(Collectors.groupingBy(emp->emp.getName().charAt(0)));
		System.out.println(map1);
	}
}
