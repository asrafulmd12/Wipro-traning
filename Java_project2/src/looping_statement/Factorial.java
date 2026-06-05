package looping_statement;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to calculate factorial:");
		int a = sc.nextInt();
		int org = a;
		int fac = 1;
		while(a > 1) {
			fac = fac * a;
			a--;
		}
		System.out.println("Factorial of "+org+" is "+fac);
		
	}

}
