package assignment_day1;
import java.util.Scanner;

public class Problem12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age:");
		int age = sc.nextInt();
		System.out.println("Enter salary:");
		int salary = sc.nextInt();
		
		if(age>=18 && salary>=15000) {
			System.out.println("Eligible for loan");
		}
		else {
			System.out.println("Not eligible for loan");
		}

	}

}
