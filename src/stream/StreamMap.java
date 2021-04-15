package stream;

import java.util.List;
import java.util.stream.Collectors;

public class StreamMap {

	public static void main(String[] args) {

		List<Student> students = IStudentRepo.getAll();

//		Fetch all student name and print
		System.out.println("Collect Student's Names");
		List<String> names = students.stream().map(student -> student.getName()).collect(Collectors.toList());
		names.forEach(System.out::println);

		// Fetch all student Id and print
		System.out.println("Collect Student's Ids");
		List<Integer> ids = students.stream().map(student -> student.getId()).collect(Collectors.toList());
		ids.forEach(System.out::println);

		// Fetch all student phone numbers and print
		System.out.println("Collect Student's phone numbers with map()");
		List<List<String>> mapList = students.stream().map(student -> student.getPhoneNumbers())
				.collect(Collectors.toList());
		System.out.println(mapList);

		System.out.println("\nCollect Student's phone numbers with flatMap()");
		List<String> flatMapList = students.stream().flatMap(student -> student.getPhoneNumbers().stream())
				.collect(Collectors.toList());
		System.out.println(flatMapList);

		System.out.println("\nUse of Stream limit()");
		students.stream().limit(2).forEach(System.out::println);
		students.stream().limit(2).map(student -> student.getName()).limit(1).forEach(System.out::println);
		
		System.out.println("\nUse of Stream distinct()");
		students.stream().distinct().forEach(System.out::println);
	}

}
