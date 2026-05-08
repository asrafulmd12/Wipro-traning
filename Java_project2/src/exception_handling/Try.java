package exception_handling;

public class Try {

	public static void main(String[] args) {
		try {
			System.out.println("1");
			int x = 10/0;
			System.out.println("3");
		}
		catch(Exception e) {
			System.out.println("Excption handled");
		}
		System.out.println("After try-catch");

	}

}
