package assignment_day2;
import java.util.Scanner;

public class Problem14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to calculate sum of digits: ");
		int num = sc.nextInt();
		int sum = 0;
		while(num>0) {
			int digit = num%10;
			sum += digit;
			num = num/10;
		}
		System.out.println(sum);

	}

}
