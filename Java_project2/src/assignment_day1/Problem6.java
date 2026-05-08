package assignment_day1;
import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character:");
		char a = sc.next().charAt(0);
		if(a=='A' || a=='a' || a=='E' || a=='e' || a=='I' || a=='i' || a=='O' || a=='o' || a=='U' || a=='u') {
			System.out.println("Vowel");
		}
		else {
			System.out.println("Consonant");
		}
		
	}

}