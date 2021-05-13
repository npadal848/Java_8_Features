package spring_joiner;

import java.util.Arrays;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class SpringJoinerPractice {

	public static void main(String[] args) {
		String input="I am a Java developer";
		//Make each word first later capital
		String[] strArr=input.split(" ");
		StringJoiner joiner=new StringJoiner(" ");
		for(String s: strArr) {
			Character.toUpperCase(s.charAt(0));
			joiner.add(Character.toUpperCase(s.charAt(0))+s.substring(1).toLowerCase());
		}
		
		System.out.println(joiner);
		
		String str = Arrays.stream(strArr).collect(Collectors.joining("_", "[", "]"));
		System.out.println(str); 
	}
}
