package practice_questions;
import java.util.*;

public class List3 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(9);
		list.add(17);
		list.add(3);
		list.add(11);
		list.add(97);
		list.add(86);
		list.add(77);
		Collections.sort(list); //sorts in ascending order
		System.out.println(list);
		

	}

}