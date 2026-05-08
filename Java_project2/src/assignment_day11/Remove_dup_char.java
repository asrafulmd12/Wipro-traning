package assignment_day11;

import java.util.LinkedHashSet;
import java.util.Set;

public class Remove_dup_char {

	public static void main(String[] args) {
		String str = "aabbbcbmghgmh";
		System.out.println("Original String: "+str);
		Set<Character> s = new LinkedHashSet<>();
		for(char c: str.toCharArray()) {
			s.add(c);
		}
		StringBuilder sb = new StringBuilder();
		for(char c: s) {
			sb.append(c);
		}
		System.out.println("After removing duplicates: "+sb.toString());
		
	}

}
