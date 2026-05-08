package assignment_day8;
import java.util.*;

public class Problem1 {

	public static void main(String[] args) {
		String str = "aaabbcddeeee";
		Map<Character, Integer> map = new HashMap<>();
		//Count frequency
		for(char ch: str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		//Find first non-repeating character
		for(char ch: str.toCharArray()) {
			if(map.get(ch)==1) {
				System.out.println("First non-repeating character is: "+ch);
			}
		}
	}

}
