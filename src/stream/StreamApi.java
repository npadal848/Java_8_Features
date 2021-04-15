package stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamApi {

	public static void main(String[] args) {
//		Creating Stream Object
		Stream<Integer> nums = Stream.of(2, 3, 4, 5, 6, 7);
		nums.filter(num -> num % 2 == 0).forEach(System.out::println);
		System.out.println("==================");

// From array to Stream
		int[] arr = { 6, 7, 2, 3, 9, 4, 5 };
		IntStream intStream = Arrays.stream(arr);
		intStream.sorted().forEach(System.out::print);
	}
}
