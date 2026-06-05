package control_statements;

public class LargestofThree {

	public static void main(String[] args) {
		int a = 91;
		int b = 19;
		int c = 17;
		if(a>b && a>c) {
			System.out.println("Largest is a");
		}
		else if(b>a && b>c) {
			System.out.println("Largest is b");
		}
		else {
			System.out.println("Largest is c");
		}
		
	}

}
