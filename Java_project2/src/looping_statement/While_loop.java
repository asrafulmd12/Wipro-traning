package looping_statement;
import java.util.Scanner;

public class While_loop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number n:");
		int n = sc.nextInt();
		int num = 1;
		int total = 0;
		while(num<=n) {
			total += num;
			num++;
		}
		System.out.println("Sum = " +total);

	}

}
