package practice_questions;
import java.util.*;

public class List5 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Math");
		list.add("English");
		list.add("Bengali");
		list.add("Physics");
		list.add("Chemistry");
		System.out.println(list);
		Collections.swap(list,0,3);// swap positions
		System.out.println(list);
		

	}

}
