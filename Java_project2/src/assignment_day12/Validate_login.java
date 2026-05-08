package assignment_day12;

import java.sql.*;
import java.util.Scanner;


public class Validate_login {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/login_db";
        String username = "root";
        String password = "root";

        Scanner sc = new Scanner(System.in);

        try {

           
            Class.forName("com.mysql.cj.jdbc.Driver");

            
            Connection con = DriverManager.getConnection(url, username, password);

            
            Statement st = con.createStatement();

            
            System.out.print("Enter Username: ");
            String uname = sc.nextLine();

            System.out.print("Enter Password: ");
            String pass = sc.nextLine();

            
            String query = "SELECT * FROM users WHERE username='"
                    + uname + "' AND password='" + pass + "'";

            
            ResultSet rs = st.executeQuery(query);

           
            if (rs.next()) {
                System.out.println("Login Successful");
            } else {
                System.out.println("Invalid Username or Password");
            }

            rs.close();
            st.close();
            con.close();
            sc.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}