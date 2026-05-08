package assignment_day2;
import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("--- Currency Converter ---");
        System.out.println("1. INR to USD");
        System.out.println("2. INR to EUR");
        System.out.println("3. INR to GBP");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();

        switch(choice) {

              case 1:
                    System.out.print("Enter amount in INR: ");
                    double amount = sc.nextDouble();
                    System.out.println("USD = " + (amount * 0.0106)); 
                    break;

              case 2:
                    System.out.print("Enter amount in INR: ");
                    amount = sc.nextDouble();
                    System.out.println("EUR = " + (amount * 0.011)); 
                    break;

              case 3:
                    System.out.print("Enter amount in INR: ");
                    amount = sc.nextDouble();
                    System.out.println("GBP = " + (amount * 0.0078)); 
                    break;

              case 4:
                    System.out.println("Exiting...");
                    break;

              default:
                    System.out.println("Invalid choice!");
            }

        
    }
}