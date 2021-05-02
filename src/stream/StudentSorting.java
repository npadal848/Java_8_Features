package stream;

import java.util.List;
import java.util.stream.Collectors;

public class StudentSorting {

	public static void main(String[] args) {
		List<Student> students = IStudentRepo.getAll();

		// sort student based on id and name in ascending order
		List<Student> sortedList = students.stream().sorted((o1, o2) -> {
			if (o1.getId() == o2.getId()) {
				return o1.getName().compareTo(o2.getName());
			}
			return o1.getId() - o2.getId();
		}).collect(Collectors.toList());
		sortedList.stream().forEach(System.out::println);
	}
}
