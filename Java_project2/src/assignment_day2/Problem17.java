package assignment_day2;
import java.util.Scanner;

public class Problem17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to generate fibonacci series upto it:");
		int num = sc.nextInt();
		int a = 0;
		int b = 1;
		int count = 1;
		while(count <= num) {
			System.out.print(a+" ");
			int next = a+b;
			a = b;
			b = next;
			count++;
		}
		
	}

}
