package assignment_day12;

import java.sql.*;
import java.util.Scanner;


public class User_input_store {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/student_db";
        String username = "root";
        String password = "root";

        Scanner sc = new Scanner(System.in);

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

           
            Connection con = DriverManager.getConnection(url, username, password);

            
            Statement st = con.createStatement();

            
            System.out.print("Enter Student ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Student Name: ");
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
                System.out.println("Student Record Inserted Successfully");
            }

            st.close();
            con.close();
            sc.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}