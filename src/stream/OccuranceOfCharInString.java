package stream;

import java.util.Map;
import java.util.stream.Collectors;

public class OccuranceOfCharInString {

	static char ch;

	public static void main(String[] args) {
		String str = "Java";

		// First Method
		Map<Character, Integer> map = str.chars().boxed()
				.collect(Collectors.toMap(key -> Character.valueOf((char) key.intValue()), value -> 1, Integer::sum));
		System.out.println(map);

//		Second Method
		Map<Character, Integer> occuranceMap = str.chars().boxed()
				.collect(Collectors.toMap(k -> Character.valueOf((char) k.intValue()), v -> 1, Integer::sum));

		System.out.println(occuranceMap);
	}
}
