package Employee;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        Employee_database dao = new Employee_database();

        while (true) {

            System.out.println("\n===== Employee Management System =====");

            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Update Salary");
            System.out.println("4. Delete Employee");
            System.out.println("5. Highest Salary");
            System.out.println("6. Lowest Salary");
            System.out.println("7. Update Department");
            System.out.println("8. Search Name Using Alphabet");
            System.out.println("9. Search By ID");
            System.out.println("10. Count Employees");
            System.out.println("11. Exit");

            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Department: ");
                    String dept = sc.nextLine();

                    System.out.print("Enter Salary: ");
                    double salary = sc.nextDouble();

                    sc.nextLine();

                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();

                    Employee_details emp =
                            new Employee_details(id, name, dept, salary, email);

                    dao.addEmployee(emp);

                    break;

                case 2:
                    dao.viewEmployees();
                    break;

                case 3:

                    System.out.print("Enter ID: ");
                    int uid = sc.nextInt();

                    System.out.print("Enter New Salary: ");
                    double usalary = sc.nextDouble();

                    dao.updateSalary(uid, usalary);

                    break;

                case 4:

                    System.out.print("Enter ID: ");
                    int did = sc.nextInt();

                    dao.deleteEmployee(did);

                    break;

                case 5:
                    dao.highestSalary();
                    break;

                case 6:
                    dao.lowestSalary();
                    break;

                case 7:

                    System.out.print("Enter ID: ");
                    int eid = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter New Department: ");
                    String ndept = sc.nextLine();

                    dao.updateDepartment(eid, ndept);

                    break;

                case 8:

                    sc.nextLine();

                    System.out.print("Enter Starting Alphabet: ");
                    String alpha = sc.nextLine();

                    dao.searchByAlphabet(alpha);

                    break;

                case 9:

                    System.out.print("Enter Employee ID: ");
                    int sid = sc.nextInt();

                    dao.searchById(sid);

                    break;

                case 10:
                    dao.countEmployees();
                    break;

                case 11:

                    System.out.println("Thank You");
                    return;

                default:

                    System.out.println("Invalid Choice");
            }
        }
    }
}