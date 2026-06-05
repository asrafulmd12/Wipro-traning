package assignment_day2;
import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your role (admin/user/guest): ");
        String role = sc.next().toLowerCase(); 

        switch(role) {

            case "admin":
                System.out.println("Access Granted:");
                System.out.println("- Full access");
                System.out.println("- Manage users");
                System.out.println("- View reports");
                break;

            case "user":
                System.out.println("Access Granted:");
                System.out.println("- Limited access");
                System.out.println("- View content");
                System.out.println("- Create content");
                break;

            case "guest":
                System.out.println("Access Granted:");
                System.out.println("- View Content Only");
                break;

            default:
                System.out.println("Invalid role!");
        }

    }
}