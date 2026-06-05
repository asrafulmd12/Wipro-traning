package assignment_day11;

import java.util.HashMap;
import java.util.Map;

public class Max_freq_char {

	public static void main(String[] args) {
		String s = "aabbbcbmghgmh";
		Map<Character,Integer> m = new HashMap<>();
		for(char c: s.toCharArray()) {
			m.put(c, m.getOrDefault(c, 0)+1);
		}
		int max_freq = 0;
		char max_char = '\0';
		for(char key: m.keySet()) {
			int val = m.get(key);
			if(val > max_freq) {
				max_freq = val;
				max_char = key;
			}
		}
		System.out.println("Element with max frequency is: "+max_char);
		

	}

}
