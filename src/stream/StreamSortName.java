package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSortName {

	public static void main(String[] args) {
		List<String> names = List.of("Nagesh", "Chintu", "Pintu", "Sivu");

		List<String> list1 = names.stream().sorted().collect(Collectors.toList());
		System.out.println(list1);

		List<String> list2 = names.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(list2);
		
		List<Employee> employees = Arrays.asList(new Employee(104, "A", 1000), new Employee(102, "B", 2000),
				new Employee(101, "C", 500), new Employee(103, "D", 300));
		
		List<Employee> idSort1 = employees.stream()
				.sorted((emp1, emp2)->emp1.getId()-emp2.getId())
				.collect(Collectors.toList());
		System.out.println(idSort1);
		
		List<Employee> idSort2 = employees.stream()
				.sorted((emp1, emp2)->emp2.getId()-emp1.getId())
				.collect(Collectors.toList());
		System.out.println(idSort2);
		System.out.println();
		List<Employee> nameSort1 = employees.stream()
				.sorted((emp1, emp2)->emp1.getName().compareTo(emp2.getName()))
				.collect(Collectors.toList());
		System.out.println(nameSort1);
		
		List<Employee> nameSort2 = employees.stream()
				.sorted((emp1, emp2)->emp2.getName().compareTo(emp1.getName()))
				.collect(Collectors.toList());
		System.out.println(nameSort2);
	}

}
