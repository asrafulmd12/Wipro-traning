package control_statements;
import java.util.Scanner;

public class Workingday_check {

	public static void main(String[] args) {
		System.out.println("Please write the day in only Uppercase");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the day:");
		String day = sc.nextLine().intern();		
		if (day=="MONDAY" || day=="TUESDAY" || day=="WEDNESDAY" || day=="THURSDAY" || day=="FRIDAY") {
			System.out.println("Today is a weekday");
		}
		else if(day=="SATURDAY" || day=="SUNDAY"){
			System.out.println("Today is a weekend");
		}
		else {
			System.out.println("Invalid day");
		}
	}

}
