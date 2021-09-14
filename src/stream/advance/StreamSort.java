package stream.advance;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import stream.Employee;

public class StreamSort {

	public static void main(String[] args) {
		List<Integer> list = List.of(4, 5, 2, 7, 1);
		List<Integer> orderList1 = list.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		System.out.println(orderList1);

		List<Employee> employees = Arrays.asList(new Employee(100, "A", 1000), new Employee(101, "B", 2000),
				new Employee(102, "C", 500), new Employee(101, "D", 300));

		List<String> names = employees.stream().map(name -> name.getName()).collect(Collectors.toList());
		System.out.println(names);

		List<Double> salary = employees.stream().map(emp -> emp.getSalary())
				.sorted().collect(Collectors.toList());
		
		System.out.println(salary);
		
		Double totalSalary = employees.stream().map(Employee::getSalary).reduce(0.0, Double::sum);
		System.out.println(totalSalary);
		
		Employee minlSalary = employees.stream().min(Comparator.comparing(Employee::getSalary)).orElse(null);
		System.out.println(minlSalary);
		
		Employee maxlSalary = employees.stream().max(Comparator.comparing(Employee::getSalary)).orElse(null);
		System.out.println(maxlSalary);
	}
}
