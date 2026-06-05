package assignment_day2;
import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter character to check Grade:");
		char ch = sc.next().charAt(0);
		switch(ch) {
		case 'A':
			System.out.println("Excellent");
			break;
		case 'B':
			System.out.println("Good");
			break;
		case 'C':
			System.out.println("Average");
			break;
		case 'D':
			System.out.println("Below Average");
			break;
		case 'F':
			System.out.println("Poor");
			break;
		default:
			System.out.println("Invalid");
		}
	}

}
