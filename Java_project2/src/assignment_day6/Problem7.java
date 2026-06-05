package assignment_day6;
import java.util.Optional;

public class Problem7 {

	public static void main(String[] args) {
		//Assigning null to Wrapper Classes
		Integer i = null;
		Boolean b = null;
		Double d = null;
		//Safe Conversion (Handling null)
		Integer i1 = null;
		int x = (i1 != null) ? i1 : 0;
		//Using Optional (Java 8+)
		Integer i2 = null;
		int x1 = Optional.ofNullable(i2).orElse(0);
		//Converting null String to Wrapper
		String str = null;
		Integer i3 = (str != null) ? Integer.valueOf(str) : null;
		//Wrapper → Wrapper (null-safe)
		Integer a = null;
		Double b1 = (a != null) ? a.doubleValue() : null;
	}

}
