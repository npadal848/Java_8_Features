package com.np.java8features;

import java.util.ArrayList;
import java.util.List;

public class ForEachMethod {

	public static void main(String[] args) {
		List<Integer> nums=new ArrayList<>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		nums.forEach(num->System.out.println(num));
	}
}
