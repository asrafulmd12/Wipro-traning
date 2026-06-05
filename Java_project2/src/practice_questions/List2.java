package practice_questions;
import java.util.*;

public class List2 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Mango");
		list.add("Apple");
		list.add("Banana");
		list.add("Watermelon");
		list.add("Orange");
		System.out.println(list);
		list.remove("Banana");
		System.out.println(list);
		

	}

}