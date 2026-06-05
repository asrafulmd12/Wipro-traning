package assignment_day1;
import java.util.Scanner;

public class Problem8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int a = sc.nextInt();
		if(a%5==0 && a%11==0) {
			System.out.println("Divisible");
		}
		else {
			System.out.println("Not divisible");
		}
		
		
	}

}
