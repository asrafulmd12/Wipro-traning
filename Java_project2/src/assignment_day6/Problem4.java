package assignment_day6;

public class Problem4 {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "hello";
		//comparing two strings
		System.out.println(s1==s2);//false --> different addresses
		System.out.println(s1.equals(s2));//false --> different content (case)
		System.out.println(s1.equalsIgnoreCase(s2));//true --> same content ignoring case

	}

}
