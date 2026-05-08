package assignment_day1;
import java.util.Scanner;

public class Problem14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number a:");
		int a = sc.nextInt();
		System.out.println("Enter number b:");
		int b = sc.nextInt();
		System.out.println("Enter Operator:");
		char op = sc.next().charAt(0);
		switch(op) {
		case '+': System.out.println(a+b);
		break;
		case '-': System.out.println(a-b);
		break;
		case '*': System.out.println(a*b);
		break;
		case '/': System.out.println(a/b);
		break;
		}
		
	}

}
