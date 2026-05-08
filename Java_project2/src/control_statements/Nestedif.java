package control_statements;

public class Nestedif {

	public static void main(String[] args) {
		float per = 86.6f;
		if(per < 0 && per >=100) {
			System.out.println("Invalid");
		}
		if(per >= 75 && per <= 100) {
			System.out.println("Dist");
			if(per>=85) {
				System.out.println("A+");
				if(per>=95) {
					System.out.println("A++");
				}
			}
		}
		else if(per>=60 && per < 75) {
			System.out.println("First class");
		}
		else if(per>=50 && per < 60) {
			System.out.println("Second class");
		}
		else if(per>=40 && per < 50) {
			System.out.println("Third class");
		}
		else {
			System.out.println("Fail");
		}

	}

}

