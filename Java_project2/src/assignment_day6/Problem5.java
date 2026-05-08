package assignment_day6;

public class Problem5 {

	public static void main(String[] args) {
		//Primitive to wrapper using valueOf
		int i = 94;
		double d = 2.14;
		
		Integer a = Integer.valueOf(i);
		Double b = Double.valueOf(d);
		
		System.out.println("int --> Integer: "+a);
		System.out.println("double --> Double: "+b);
		
		System.out.println("--- String to Wrapper ---");
		Integer fromstr1 = Integer.valueOf("135");
		Double fromstr2 = Double.valueOf("9.78");
		
		System.out.println("\"123\"  → Integer : " + fromstr1);
	    System.out.println("\"9.99\" → Double  : " + fromstr2);
		
		
		

	}

}
