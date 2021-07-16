package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GetDistinctEleFromList {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 3, 4,2, 5);
		List<Integer> distList = list.stream().distinct().collect(Collectors.toList());
		System.out.println(distList);
	}
}
