/*
 * Project Name: Employee Payroll
 * Created by: Christopher Harper, Curtis Heslop, Daniel Guzman
 * Input:
 * The user is ask their employee information such as
 * name, ID number, DOB, last 4 of SSN, then after that the user
 * is asked the type of employee they are, then it will displays
 * other questions base on that.
 * Output:
 * The program displays the Employee check total according
 * to the type of employee the person is.
 *
 */
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Payroll {
    public static void main(String[] args)throws IOException {

        //Scanner object to get the users input.
        Scanner input = new Scanner(System.in);
        //Prompts the user to enter their first name and stores the value in the firstName variable.
        System.out.print("Please Enter First Name: ");
        String firstName = input.next();
        //Prompts the user to enter their last name and stores the value in the lastName variable.
        System.out.print("Please Enter Last Name: ");
        String lastName = input.next();

        //Prompts the user to enter their ID number and stores the value in the idNumber variable.
        System.out.print("Please Enter ID Number: ");
        int idNumber = input.nextInt();

        //Prompts the user to enter their date of birth and stores the value in the dob variable.
        String dob = null;
        boolean continueInput = true;
        // if the user enters the wrong format, try again
        do {
            System.out.print("Please Enter Date of Birth: mm-dd-yyyy ");
            dob = input.next();
            // Creates object dateFormat and sets a pattern
            DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
            try {
                // parse string
                dateFormat.parse(dob);
                // exit if matches pattern
                continueInput = false;
            } // throws an exception
            catch (ParseException e){
                System.out.println("Invalid date. Please try again.");
            }
        } while (continueInput);
        //Prompts the user to enter their social security number and stores the value in the ssn variable.
        System.out.print("Please Enter Last 4 of SSN: ");
        String ssn = input.next();

        //Employee Object that calls its variables firstName, lastName, idNumber, dob, and ssn.
        Employee employees = new Employee(firstName, lastName, idNumber, dob, ssn);

        // Switch statement to determine the type of employee, prompts the user to enter 1, 2, or 3, depending on the type of employee and stores the value in choice.
        System.out.println("\nEmployee Type: ");
        System.out.println("1: Hourly");
        System.out.println("2: Salary");
        System.out.println("3: Exit");
        System.out.print("Choice: ");
        int choice = input.nextInt();
        switch (choice){
            case 1: // Since Hourly has 3 different attributes, I enter them here..
                //Prompts the user to enter the numbers of hours they worked and stores the value in variable hoursWorked.
                System.out.print("Please Enter Number of Hours Worked: ");
                double hoursWorked = input.nextDouble();

                //Prompts the user to enter their wage and stores the value in the variable hourlyWage.
                System.out.print("Please Enter Your Wage: ");
                double hourlyWage = input.nextDouble();

                //Polymorphism (Array of base class Employee, and HourlyEmployee reference.) Points to an instance in the two derived classes.
                Employee[] people = {new Employee(firstName, lastName, idNumber, dob, ssn), new HourlyEmployee(hoursWorked, hourlyWage)};

                //for loop to invoke the employeeCheck method within the Employee Class, and HourlyEmployee Class.
                for (int i = 0; i < people.length; i++) {
                    people[i].employeeCheck();
                }
                break;

            case 2:
                //Prompts the user to enter their salary and stores the value in variable salaryAmount.
                System.out.print("Please Enter Your Salary: ");
                double salaryAmount = input.nextDouble();

                //Polymorphism (Array of base class Employee, and SalaryEmployee reference.) Points to an instance in the two derived classes.
                Employee[] salaryEmployee = {new Employee(firstName, lastName, idNumber, dob, ssn), new SalaryEmployee(salaryAmount)};

                //for loop to invoke the employeeCheck method within the Employee Class, and SalaryEmployee Class.
                for (int i = 0; i < salaryEmployee.length; i++) {
                    salaryEmployee[i].employeeCheck();
                }
                break;
            case 3:
                System.exit(1);
                break;
            default: System.out.println("Error: Invalid Option Selected");
                System.exit(1);
        }
        // Creates a file name txt and checks if it already exist.
        java.io.File file = new java.io.File(employees.getFirstName() + employees.getLastName()+ "Payroll.txt");
        // if file already exist, display message and exit.
        if(file.exists()){
            System.out.println("File already exists");
            System.exit(1);
        }
        // else create a new file and get its name.
        else {
            System.out.println("File created: " + file.getName());
        }
        {
            // Writes to the file and print that it wrote successfully.
            java.io.PrintWriter output = new java.io.PrintWriter(file);
            // writes data to Payroll.txt
            output.println("First Name: " + employees.getFirstName());
            output.println("Last Name: " + employees.getLastName());
            output.println("Employee ID Number: " + employees.getIdNumber());
            output.println("Date of Birth: " + employees.getDob());
            output.println("Employee SSN: " + employees.getSsn());
            output.println("Employee Check Total: ");
            System.out.println("Successfully wrote to the file.");
            output.close();
        }

        System.out.println("\nDisplay content from Payroll.txt");

        // Read content from Payroll.txt and displays it
        java.io.File display = new java.io.File(employees.getFirstName()+ employees.getLastName()+"Payroll.txt");
        Scanner inputDisplay = new Scanner(display);
        // display everything line by line until ends.
        while (inputDisplay.hasNextLine()){
            String info = inputDisplay.nextLine();
            System.out.println(info);
        }
        inputDisplay.close(); // close display

    }
}