package com.np.java8features;

import java.util.Optional;

public class OptionalPractice {

	public static void main(String[] args) {

		String[] strs = new String[4];
		strs[0] = "Nages";
		strs[1] = "Tungu";
		strs[3] = "Sivu";

//		for (String str : strs) {
//			System.out.println(str.toLowerCase()); // throws NullPointerException for index 2
//		}

//		To avoid NullPointerException which above commented line throws we can use Optinal from Java 8
		for (String str : strs) {
			Optional<String> optStr = Optional.ofNullable(str);
			optStr.ifPresent(System.out::println);
		}
	}
}
