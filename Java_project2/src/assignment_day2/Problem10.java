package assignment_day2;
import java.util.Scanner;

public class Problem10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to calculate multiplication table:");
		int num = sc.nextInt();
		int a = 1;
		while(a<=10) {
			System.out.println(num+" X "+a+" = "+(num*a));
			a++;
		}
	}

}

