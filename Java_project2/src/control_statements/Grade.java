package control_statements;

public class Grade {

	public static void main(String[] args) {
		float per = 96.4f;
		if(per < 0 || per > 100) {
			System.out.println("Invalid");
		}
		else if(per>=75 && per <= 100) {
			System.out.println("Dist");
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
