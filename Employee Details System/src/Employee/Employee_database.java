package Employee;

import java.sql.*;

public class Employee_database {

    Connection con;

    // Constructor
    public Employee_database() throws Exception {

        con = Db_connection.getConnection();

    }

    // Add Employee
    public void addEmployee(Employee_details emp) {

        try {

            Statement st = con.createStatement();

            String query = "INSERT INTO employee VALUES("
                    + emp.getId() + ",'"
                    + emp.getName() + "','"
                    + emp.getDepartment() + "',"
                    + emp.getSalary() + ",'"
                    + emp.getEmail() + "')";

            int rows = st.executeUpdate(query);

            if (rows > 0) {

                System.out.println("Employee Added Successfully");

            }

        } catch (Exception e) {

            System.out.println(e);

        }
    }
 // View Employees
    public void viewEmployees() {

        try {

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("SELECT * FROM employee");
            System.out.println("ID NAME DEPARTMENT SALARY EMAIL");
            while (rs.next()) {
            	

                System.out.println(
                        rs.getInt("id") + " "
                        + rs.getString("name") + " "
                        + rs.getString("department") + " "
                        + rs.getDouble("salary") + " "
                        + rs.getString("email")
                );
            }

        } catch (Exception e) {

            System.out.println(e);

        }
    }

    // Update Salary
    public void updateSalary(int id, double salary) {

        try {

            Statement st = con.createStatement();

            String query =
                    "UPDATE employee SET salary="
                            + salary +
                            " WHERE id=" + id;

            int rows = st.executeUpdate(query);

            if (rows > 0) {

                System.out.println("Salary Updated");

            } else {

                System.out.println("Employee Not Found");

            }

        } catch (Exception e) {

            System.out.println(e);

        }
    }

    // Update Department
    public void updateDepartment(int id, String dept) {

        try {

            Statement st = con.createStatement();

            String query =
                    "UPDATE employee SET department='"
                            + dept +
                            "' WHERE id=" + id;

            int rows = st.executeUpdate(query);

            if (rows > 0) {

                System.out.println("Department Updated");

            }

        } catch (Exception e) {

            System.out.println(e);

        }
    }

    // Delete Employee
    public void deleteEmployee(int id) {

        try {

            Statement st = con.createStatement();

            String query =
                    "DELETE FROM employee WHERE id=" + id;

            int rows = st.executeUpdate(query);

            if (rows > 0) {

                System.out.println("Employee Deleted");

            }

        } catch (Exception e) {

            System.out.println(e);

        }
    }

    // Search by ID
    public void searchById(int id) {

        try {

            Statement st = con.createStatement();

            String query =
                    "SELECT * FROM employee WHERE id=" + id;

            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {

                System.out.println(
                        rs.getInt("id") + " "
                        + rs.getString("name") + " "
                        + rs.getString("department") + " "
                        + rs.getDouble("salary") + " "
                        + rs.getString("email")
                );
            }

        } catch (Exception e) {

            System.out.println(e);

        }
    }

    // Search Name Using Alphabet
    public void searchByAlphabet(String alphabet) {

        try {

            Statement st = con.createStatement();

            String query =
                    "SELECT * FROM employee WHERE name LIKE '"
                            + alphabet + "%'";

            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {

                System.out.println(
                        rs.getInt("id") + " "
                        + rs.getString("name") + " "
                        + rs.getString("department") + " "
                        + rs.getDouble("salary") + " "
                        + rs.getString("email")
                );
            }

        } catch (Exception e) {

            System.out.println(e);

        }
    }

    // Highest Salary
    public void highestSalary() {

        try {

            Statement st = con.createStatement();

            String query =
                    "SELECT * FROM employee ORDER BY salary DESC LIMIT 1";

            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {

                System.out.println("Highest Salary Employee:");

                System.out.println(
                        rs.getString("name")
                                + " Salary: "
                                + rs.getDouble("salary")
                );
            }

        } catch (Exception e) {

            System.out.println(e);

        }
    }

    // Lowest Salary
    public void lowestSalary() {

        try {

            Statement st = con.createStatement();

            String query =
                    "SELECT * FROM employee ORDER BY salary ASC LIMIT 1";

            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {

                System.out.println("Lowest Salary Employee:");

                System.out.println(
                        rs.getString("name")
                                + " Salary: "
                                + rs.getDouble("salary")
                );
            }

        } catch (Exception e) {

            System.out.println(e);

        }
    }

    // Count Employees
    public void countEmployees() {

        try {

            Statement st = con.createStatement();

            ResultSet rs =
                    st.executeQuery("SELECT COUNT(*) FROM employee");

            if (rs.next()) {

                System.out.println(
                        "Total Employees = " + rs.getInt(1)
                );
            }

        } catch (Exception e) {

            System.out.println(e);

        }
    }
}