package stream.advance;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

import stream.Employee;

public class MaxSalaryOfEmployee {

	public static void main(String[] args) {
		List<Employee> emps = Arrays.asList(
				new Employee(100, "A", 1000), 
				new Employee(101, "B", 2000),
				new Employee(102, "C", 500), 
				new Employee(101, "D", 300)
				);
		
		Optional<Employee> maxSalEmp = emps.stream()
			.reduce(BinaryOperator.maxBy((emp1, emp2)->(int)Math.round(emp1.getSalary()-emp2.getSalary())));
		
		System.out.println(maxSalEmp.get());
		
		long count = emps.stream().filter(emp->emp.getSalary()>=1000).count();
		
		System.out.println(count);
	}
}
