package assignment_day11;

import java.util.HashMap;
import java.util.Map;

public class Non_rep_char {

	public static void main(String[] args) {
		String s = "aabbbcbmghgmh";
		Map<Character,Integer> m = new HashMap<>();
		for(char c: s.toCharArray()) {
			m.put(c,m.getOrDefault(c, 0)+1 );
		}
		for(char c: s.toCharArray()) {
			if(m.get(c)==1) {
				System.out.println("First non-repeating character is: "+c);
				return;
			}
		}System.out.println("No non-repeating character found");
		

	}

}
