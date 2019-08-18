/*
 * Name: SalaryEmployee Class
 * Input: Extends to Employee class to inherit its attributes and
 * creates a new salary attribute
 * Output: returns the salary as Salary employee type
 *
 */

public class SalaryEmployee extends Employee{

    // Private variable name salary
    private double salary;

    // non-arg constructor that creates a default SalaryEmployee
    public SalaryEmployee() {
    }

    // Constructor that uses the variable passed into the method when call, and places its new value into it
    public SalaryEmployee(double salary) {
        this.salary = salary;
    }

    // Gets the salary of employee and returns its value
    public double getSalary() {
        return salary;
    }

    // Takes the value passed and sets it the new value
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Calculates the total of salary and prints it out
    public void employeeCheck() {
        double total = salary/52;
        System.out.println("This weeks check: $" + Math.round(total * 100.00) / 100.00);
    }
}