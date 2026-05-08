package assignment_day1;
import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int a = sc.nextInt();
		System.out.println("Enter a number:");
		int b = sc.nextInt();
		if(a>b) {
			System.out.println(a+" is largest");
		}
		else if(b>a) {
			System.out.println(b+" is largest");
		}
		else {
			System.out.println("Both are equal");
			
		}

	}

}