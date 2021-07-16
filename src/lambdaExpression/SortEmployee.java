package lambdaExpression;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortEmployee {

	public static void main(String[] args) {
		
//		Sort based on Employee ID and Employee Name
		List<Employee> list = Arrays.asList(new Employee(101, "Nagesh", "HYD"), new Employee(102, "Bimal", "HYD"),
				new Employee(103, "Pawan", "HYD"), new Employee(101, "Aditya", "HYD"));

//		Sort using Lamda Experssion
		Collections.sort(list, (emp1, emp2) -> {
			if (emp1.getId() == emp2.getId())
				return emp1.getName().compareTo(emp2.getName());
			else
				return emp1.getName().compareTo(emp2.getName());

		});
		
		System.out.println(list);
	}
}