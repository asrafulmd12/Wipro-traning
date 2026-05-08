package assignment_day7;
import java.util.*;

public class Problem3 {

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
		result.addAll(set2);//It takes all elements from set 2 and add it to result set but no duplicates it's like union.
		Set<Integer> helper = new HashSet<Integer>(set1);
		helper.retainAll(set2);//Only Common elements from both set is added to helper set.
		result.removeAll(helper);//Common elements from both sets is removed from result set.
		System.out.println("The symmetric difference between two sets are: "+result);
	}

}
