package assignment_day2;
import java.util.Scanner;

public class Problem9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to calculate factorial:");
		int num = sc.nextInt();
		int fac = 1;
		while(num>1) {
			fac = fac*num;
			num--;
		}
		System.out.println(fac);
		}

}
