package assignment_day2;
import java.util.Scanner;

public class Problem16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check prime or not:");
		int num = sc.nextInt();
		int a = 2;
		boolean isprime = true;
		if(num<=1) {
			isprime = false;
		}
		else {
			while(a<num) {
				if(num%a==0) {
					isprime = false;
					break;
				}
				a++;
			}
		}
		if(isprime) {
			System.out.println(num+" is a prime number.");
		}
		else {
			System.out.println(num+" is not a prime number");
		}
	}

}
