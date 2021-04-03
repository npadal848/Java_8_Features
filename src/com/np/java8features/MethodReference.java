package com.np.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MethodReference {

	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(1, 12, 433, 5);

//		There are 4 types of Method reference present
//		1. Static Mathod reference
		Optional<Integer> max = integers.stream().reduce(Math::min);

//		2. Instance Method reference
		max.ifPresent(System.out::println);

//		3. Method reference to instance method from class type – Class::instanceMethodName
//		Traditional Way of implementation
		List<String> strings = Arrays.asList("how", "to", "do", "in", "java", "dot", "com");

		List<String> sorted = strings.stream().sorted((s1, s2) -> s1.compareTo(s2)).collect(Collectors.toList());

		System.out.println("Traditional Way: " + sorted);

//		With Method Reference
		List<String> sorted1 = strings.stream().sorted(String::compareTo).collect(Collectors.toList());
		System.out.println("With Method Reference" + sorted1);
	}
}
