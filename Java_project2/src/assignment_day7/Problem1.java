package assignment_day7;
import java.util.*;

public class Problem1 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(25,15,64,23,61,91);
		Collections.sort(list);
		System.out.println("The second largest element of the list is: "+list.get(list.size() - 2));

	}

}
