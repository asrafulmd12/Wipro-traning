package control_statements;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number a:");
		int a = sc.nextInt();
		
		System.out.println("Enter number b:");
		int b = sc.nextInt();
		
		System.out.println("Enter operator:");
		String op = sc.next();
		
		switch (op) {
		case "+": System.out.println(a + b);
		break;
		case "-": System.out.println(a - b);
		break;
		case "*": System.out.println(a * b);
		break;
		case "/": System.out.println(a / b);
		break;
		default: System.out.println("invalid operator");
		
		}
		
		
		
		

	}

}
