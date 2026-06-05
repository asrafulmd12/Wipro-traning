package assignment_day1;
import java.util.Scanner;

public class Problem13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check divisible by 3 or 7 or not:");
		int a = sc.nextInt();
		
		if(a%3==0 && a%7==0) {
			System.out.println("Divisible");
		}
		else {
			System.out.println("Not divisible");
		}
	
	}

}