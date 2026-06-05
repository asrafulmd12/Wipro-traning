package assignment_day1;
import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check positive or negative:");
		int a = sc.nextInt();
		if(a>=0) {
			System.out.println("Positive");
		}
		else{
			System.out.println("negative");
		}

	}

}
