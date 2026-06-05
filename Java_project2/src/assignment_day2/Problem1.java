package assignment_day2;
import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check Even or Odd:");
		int num = sc.nextInt();
		switch(num%2) {
		case 0:
			System.out.println("Even");
			break;
		case 1:
			System.out.println("Odd");
			break;
		default:
			System.out.println("Invalid");
		}
	}

}