package assignment_day12;

import java.sql.*;


public class Dis_all_records {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/school";
        String username = "root";
        String password = "root";

        try {

            
            Class.forName("com.mysql.cj.jdbc.Driver");

            
            Connection con = DriverManager.getConnection(url, username, password);

            
            Statement st = con.createStatement();

            
            String query = "SELECT * FROM students";

            
            ResultSet rs = st.executeQuery(query);

           
            System.out.println("ID\tName\tCourse\tMarks");

            while (rs.next()) {

                int id = rs.getInt("id");
                String name = rs.getString("name");
                String course = rs.getString("course");
                int marks = rs.getInt("marks");

                System.out.println(id + "\t" + name + "\t" + course + "\t" + marks);
            }

            rs.close();
            st.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}