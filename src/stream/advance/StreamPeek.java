package stream.advance;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamPeek {

	public static void main(String[] args) {
		List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7);

		nums.stream().peek(System.out::println).mapToInt(Integer::intValue).toArray();
	}
}
