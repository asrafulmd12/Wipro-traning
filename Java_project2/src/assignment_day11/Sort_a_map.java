package assignment_day11;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Sort_a_map {

	public static void main(String[] args) {
		Map<Integer,Character> m = new TreeMap<>();
		m.put(4,'D');
		m.put(5,'E');
		m.put(1,'A');
		m.put(3,'C');
		m.put(2,'B');
		Map<Integer,Character> sortedMap = new TreeMap<>(Collections.reverseOrder());
		sortedMap.putAll(m);
		System.out.println(sortedMap);
	}

}
