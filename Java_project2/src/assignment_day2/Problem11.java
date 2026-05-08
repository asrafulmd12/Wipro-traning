package assignment_day2;
import java.util.Scanner;

public class Problem11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to count number of digits: ");
		int num = sc.nextInt();
		int count = 0;
		while(num>0) {
			int a = num/10;
			count++;
			num = a;
		}
		System.out.println(count);

	}

}