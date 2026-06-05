package assignment_day2;
import java.util.Scanner;

public class Problem15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int original = num;
        int count = 0;
        int sum = 0;
        int op = num;
        while(op>0) {
        	count++;
        	op = op/10;
        }
        while(num!=0) {
        	int digit = num % 10;
        	sum = sum + (int)Math.pow(digit,count);
        	num = num /10;
        	
        }
        if(original==sum) {
        	System.out.println("Armstrong number");
        }
        else {
        	System.out.println("Not a armstrong number");
        }
    }
}
