package stream.advance;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class SreamFlatMap {

	public static void main(String[] args) {
		List<List<String>> names = List.of(List.of("A", "B"), List.of("C", "D"), List.of("E", "F"));

		List<String> nameList = names.stream().flatMap(Collection::stream).collect(Collectors.toList());
		System.out.println(nameList);
	
	}
}
