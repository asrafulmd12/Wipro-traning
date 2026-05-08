
package assignment_day2;
import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ATM Operations:");
		System.out.println("Press '1' to check balance");
		System.out.println("Press '2' to deposit");
		System.out.println("Press '3' to withdraw");
		System.out.println("Press '4' to Exit");
		System.out.println("Enter your choice");
		int ch = sc.nextInt();
		double balance = 120000;
		switch(ch) {
		case 1:
			System.out.println("Current Balance: "+balance);
			break;
		case 2:
			System.out.print("Enter amount to deposit: ");
			double deposit = sc.nextDouble();	
			if (deposit > 0) {
				balance += deposit;
				System.out.println("Amount deposited successfully");
			}
			else {
				System.out.println("Invalid Amount!");
			}
			break;
		case 3:
			System.out.print("Enter Amount to withdraw: ");
			double withdraw = sc.nextDouble();
			if(withdraw>0 && withdraw <= balance) {
				System.out.println("Withdrawl successful");
			}
			else {
				System.out.println("Insufficient balance or invalid amount");
			}
			break;
		case 4:
			System.out.println("Thank you visit again...");
			break;
		default:
			System.out.println("Invalid choice! Try again.");
		}
	}

}