package assignment_day1;
import java.util.Scanner;

public class Problem9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks:");
		int a = sc.nextInt();
		if(a<0 || a>100) {
			System.out.println("Invalid marks");
		}
		else if(a>=90 && a <=100) {
			System.out.println("O");
		}
		else if(a>=80 && a<90) {
			System.out.println("E");
		}
		else if(a>=70 && a<80) {
			System.out.println("A");
		}
		else if(a>=60 && a<70) {
			System.out.println("B");
		}
		else if(a>=50 && a<60) {
			System.out.println("C");
		}
		else if(a>=40 && a<50) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}
		
		
	}

}