package assignment_day7;
import java.util.*;

public class Problem2 {

	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<Integer>();
		Set<Integer> set2 = new HashSet<Integer>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		set2.add(4);
		set2.add(5);
		set2.add(6);
		set2.add(7);
		Set<Integer> result = new HashSet<Integer>(set1);
		result.retainAll(set2);//here result set is modified, only common elements are present.
		System.out.println("Common elements between two sets are: "+result);

	}

}
