package practice_questions;
import java.util.*;

public class List4 {

	public static void main(String[] args) {
		List<Character> list = new ArrayList<Character>();
		list.add('a');
		list.add('B');
		list.add('c');
		list.add('D');
		list.add('e');
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		

	}

}