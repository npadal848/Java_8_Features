package stream.advance;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamPartitioningBy {

	public static void main(String[] args) {
		List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7);

		Map<Boolean, List<Integer>> map = nums.stream().collect(Collectors.partitioningBy(num -> num % 2 == 0));
		System.out.println(map);
	}
}
