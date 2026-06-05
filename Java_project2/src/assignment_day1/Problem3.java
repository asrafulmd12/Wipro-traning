package assignment_day1;
import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check positive or negative:");
		int a = sc.nextInt();
		if(a>0) {
			System.out.println("Positive");
		}
		else if(a<0) {
			System.out.println("negative");
		}
		else {
			System.out.println("Zero");
		}

	}

}