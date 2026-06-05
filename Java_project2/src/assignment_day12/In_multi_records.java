package assignment_day12;

import java.sql.*;
import java.util.Scanner;


public class In_multi_records {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/school";
        String username = "root";
        String password = "root";

        Scanner sc = new Scanner(System.in);

        try {

            
            Class.forName("com.mysql.cj.jdbc.Driver");

            
            Connection con = DriverManager.getConnection(url, username, password);

           
            Statement st = con.createStatement();

           
            System.out.print("How many students you want to insert? ");
            int n = sc.nextInt();

           
            for (int i = 1; i <= n; i++) {

                System.out.println("\nEnter Details of Student " + i);

                System.out.print("Enter ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Course: ");
                String course = sc.nextLine();

                System.out.print("Enter Marks: ");
                int marks = sc.nextInt();

                
                String query = "INSERT INTO students VALUES("
                        + id + ", '"
                        + name + "', '"
                        + course + "', "
                        + marks + ")";

               
                int rows = st.executeUpdate(query);

                if (rows > 0) {
                    System.out.println("Record Inserted Successfully");
                }
            }

            st.close();
            con.close();
            sc.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}