package assignment_day2;
import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter food number from 1 to 5:");
		int ch = sc.nextInt();
		switch(ch) {
		case 1:
			System.out.println("Item name: Biriyani"+", Price: 150");
			break;
		case 2:
			System.out.println("Item name: Chow mein"+", Price: 100");
			break;
		case 3:
			System.out.println("Item name: Mughlai Paratha"+", Price: 120");
			break;
		case 4:
			System.out.println("Item name: Chilli Chicken"+", Price: 250");
			break;
		case 5:
			System.out.println("Item name: Kadai Paneer"+", Price: 220");
			break;
		default:
			System.out.println("Invalid Choice");
		}
	}

}
