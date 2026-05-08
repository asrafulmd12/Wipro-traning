package assignment_day1;
import java.util.Scanner;

public class Problem11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a:");
		int a = sc.nextInt();
		System.out.println("Enter b:");
		int b = sc.nextInt();
		System.out.println("Enter c:");
		int c = sc.nextInt();
		if(a<b && a<c) {
			System.out.println(a+" is smallest");
		}
		else if(b<a && b<c) {
			System.out.println(b+" is smallest");
		}
		else {
			System.out.println(c+" is smallest");
		}

	}

}