package assignment_day6;

public class Problem6 {

	public static void main(String[] args) {
		//Creating Boolean Objects
		Boolean b1 = Boolean.valueOf(true);
		Boolean b2 = Boolean.valueOf(false); // recommended
		Boolean b3 = true; // autoboxing
		//Converting String to Boolean
		Boolean b = Boolean.valueOf("true");
		System.out.println(b); // Returns true only if the string equals "true" (ignoring case).
        // Converting Boolean to String
		Boolean b4 = true;
		String str = b4.toString();
		System.out.println(str); // "true"
		//Parsing Boolean
		boolean b5 = Boolean.parseBoolean("false");
		System.out.println(b5); // Returns primitive boolean, not object.
        // Using Boolean in Conditions
		Boolean b6 = true;//Auto-unboxing converts boolean → Boolean.

		if (b6) {
		    System.out.println("It is true");
		}

        // Comparing Boolean Objects
		Boolean b7 = true;
		Boolean b8 = true;

		System.out.println(b7 == b8);        // true (cached)
		System.out.println(b7.equals(b8));   // true (recommended)
        // Boolean Constants
		System.out.println(Boolean.TRUE);
		System.out.println(Boolean.FALSE);

        // Logical Operations with Boolean
		Boolean b9 = true;
		Boolean b0 = false;

		System.out.println(b9 && b0); // false
		System.out.println(b9 || b0); // true
		System.out.println(!b9);      // false
	}

}
