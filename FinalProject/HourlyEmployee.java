/*
 * Name: HourlyEmployee Class
 * Input: Extends to Employee class to inherit its attributes, creates
 * attributes associated with an Hourly Employee type
 * Output: Returns attributes and computes a formula to display the
 * employeeCheck total
 *
 */

public class HourlyEmployee extends Employee {

    //private variable with a decimal point for the number of hours the employee has worked
    private double hoursWorked;

    //private variable with a decimal point for the wage the employee earns per hour
    private double hourlyWage;

    //private variable with a decimal point for when the employee works more then 40 hours a week
    private double overtimeHours;

    // no-arg constructor which creates a default HourlyEmployee
    public HourlyEmployee() {
    }

    //Uses the variables passed into the method when called, and places the new values into the same variables.
    public HourlyEmployee(double hoursWorked, double hourlyWage) {

        //Used this.variable, with this meaning this object since we're using the same variable name as what was passed into the method.
        this.hoursWorked = hoursWorked;
        this.hourlyWage = hourlyWage;

    }

    //gets the private variable hoursWorked and returns it to be used.
    public double getHoursWorked() {
        return hoursWorked;
    }

    //gets the private variable hourlyWage and returns it to be used.
    public double getHourlyWage() {
        return hourlyWage;
    }

    //gets the private variable overtimeHours and return it to be used.
    public double getOvertimeHours() {
        return overtimeHours;
    }

    //takes the value passed into the method in variable hoursWorked, and sets the private variable hoursWorked to the new value.
    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    //takes the value passed into the method in variable hoursWorked, and sets the private variable hourlyWage to the new value.
    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }
    //takes the value passed into the method in variable overtimeHours, and sets the private variable overtimeHours to the new value.
    public void setOvertimeHours(double overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    //Method to calculate the employees paycheck based on hours worked, their wage, and if they worked overtime hours.
    public void employeeCheck() {

        //Determines if the employee worked more then 40 hours, if so times the employees wage by 1.5 for the overtime hours worked and returns the value.
        if (hoursWorked > 40) {
            double overtimeHours = (40 * hourlyWage) + ((hoursWorked - 40) * hourlyWage * 1.5);

            //Display's to the user the total pay with overtime, rounded to two decimal points.
            System.out.println("This weeks check: $" + Math.round(overtimeHours * 100.00) / 100.00);
        }

        //If the employee didn't work over 40 hours, return the value of the hours worked * their wage.
        else {
            double overtimeHours = hoursWorked * hourlyWage;

            //Display's to the user the total pay with no overtime, rounded to two decimal points.
            System.out.println("This weeks check: $" + Math.round(overtimeHours * 100.00) / 100.00);
        }
    }
}
		