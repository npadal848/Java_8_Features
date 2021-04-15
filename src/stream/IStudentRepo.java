package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface IStudentRepo {

	static List<Student> getAll() {
		return Stream
				.of(new Student(100, "Nagesh", Arrays.asList("845234567", "1234567890")),
						new Student(101, "Aditya", Arrays.asList("754745367", "8566456464")),
						new Student(102, "Rakesh", Arrays.asList("853323678", "0987634667")),
						new Student(103, "Santosh", Arrays.asList("7543456778", "843445645")),
						new Student(101, "Aditya", Arrays.asList("754745367", "8566456464")))
				.collect(Collectors.toList());

	}
}
