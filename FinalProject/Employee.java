/*
 * Name: Employee class
 * Input: creates attributes for an employee
 * Output: returns attributes and computes a EmployeeCheck formula
 */

public class Employee {

    //private variable for the users first name.
    private String firstName;

    //private variable for the users last name.
    private String lastName;

    //private variable with no decimal points for the users ID number.
    private int idNumber;

    //private variable for the users date of birth.
    private String dob;

    //private variable for the users social security number.
    private String ssn;

    // no-arg constructor which creates a default Employee
    public Employee() {

    }

    //Uses the variables passed into the method when called, and places the new values into the same variables.
    public Employee(String firstName, String lastName, int idNumber, String dob, String ssn) {

        //Used this.variable, with this meaning this object since we're using the same variable name as what was passed into the method.
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.dob = dob;
        this.ssn = ssn;
    }

    //gets the private variable firstName and returns it to be used.
    public String getFirstName() {
        return firstName;
    }

    //takes the value passed into the method in variable firstName, and sets the private variable firstName to the new value.
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    //gets the private variable lastName and returns it to be used.
    public String getLastName() {
        return lastName;
    }

    //takes the value passed into the method in variable lastName, and sets the private variable lastName to the new value.
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //gets the private variable idNumber and returns it to be used.
    public int getIdNumber() {
        return idNumber;
    }

    //takes the value passed into the method in variable idNumber, and sets the private variable idNumber to the new value.
    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    //gets the private variable dob and returns it to be used.
    public String getDob() {
        return dob;
    }

    //takes the value passed into the method in variable dob, and sets the private variable dob to the new value.
    public void setDob(String dob) {
        this.dob = dob;
    }

    //gets the private variable ssn and returns it to be used.
    public String getSsn() {
        return ssn;
    }

    //takes the value passed into the method in variable ssn, and sets the private variable ssn to the new value.
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    //Method to display the users check with the users name, id number, date of birth, and social security number.
    public void employeeCheck() {
        System.out.println("\nEmployee: " + firstName + " " + lastName + "\nDate of Birth: " + dob + "\nId Number: " + idNumber + "\nSSN: " + ssn);

    }

}

