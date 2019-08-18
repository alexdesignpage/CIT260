public class Payroll{

	firstName // private String variable
	lastName // private String variable 
	idNumber // private int variable 
	dob // private String variable
	ssn  // private String variable 

	// Non-arg constructor that creates a default Employee Method
	PUBLIC employee()

	// Constructor that takes 5 different variables and returns its new values
	PUBLIC employee(firstName,lastName,idNumber,dob, ssn)

	// Gets the firstName of employee and returns its value
	PUBLIC getFirstName()
		RETURNS  firstName;

	// Takes the value passed and sets it the new value  
	PUBLIC setFirstName(firstName)
		firstName = firstName

	// Gets the LastName of employee and returns its value
	PUBLIC getLastName()
		RETURNS lastName;

	// Takes the value passed and sets it the new value  
	PUBLIC setLastName(lastName)
		lastName = lastName

	// Gets the IDNumber of employee and returns its value
	PUBLIC getIDNumber()
		RETURNS idNumber;

	// Takes the value passed and sets it the new value  
	PUBLIC setIDNumber(idNumber)
		idNumber = idNumber

	// Gets the DOB of employee and returns its value
	PUBLIC getDOB()
		RETURNS dob;

	// Takes the value passed and sets it the new value  
	PUBLIC setDob(dob)
		dob = dob

	// Gets the SSN of employee and returns its value
	PUBLIC getSsn()
		RETURNS ssn;

	// Takes the value passed and sets it the new value  
	PUBLIC setSsn(ssn)
		ssn = ssn

	// Creates a method called employeeType, ask the user for input and returns type
	PUBLIC employeeType()
		PRINT "Please enter your pay type:"
		RETURNS type;




// MAIN METHOD 

Public static void main(String[] args){

	// Uses the Scanner method to get input from the user
	SCANNER SYSTEM.IN 

	// Displays questions to employee 
	PRINT "Please enter first name: "
	PRINT "Please enter last name: "
	PRINT "Please enter ID number: "

	// Added exception for DOB to make sure format entered is correct 
	PRINT "Please enter date of birth: FORMAT: MM-DD-YYYY"
		DateFormat = SimpleDateFormat("mm-dd-yyyy")
			TRY 
				String dateStr
				dateFormat.parse(dateStr)
			CATCH (ParseException e)
				e.printStackTrace()
	
	// Added exception for SSN to make sure the format enter is correct 	
	PRINT "Please enter Social Security Number: "
		TRY
			IF (ssn.length != 11)
				THROW NEW EXCEPTION "Wrong number of characters"
			ELSE IF (ssn.charAt(3) != '-' || ssn.charAt(6) !- '-')
				THROW NEW EXCEPTION "Dashes at wrong position!"	
			ELSE
				FOR ( X = 0, ssn.length, x++)
					IF(ssn.charAt(x) == '-' || CHARACTER.isDigit(ssn.charAt(x)))
			CONTINUE 
				ELSE 
					THROW NEW EXCEPTION "Contains a character that is not a number"	

		CATCH (Exception e)
			PRINT "SSN is wrong " 


    // Creates an object of Payroll
	Payroll new Payroll()  

	// USES JAVA IO to write to a file name Payroll.txt 
	JAVA.IO.FILE file ("Payroll.txt")

	// If file already exist, throw an error! 
	IF file EXIST 
		PRINT "File already exist"
	EXIT

	// FILE OUTPUT FORMAT 
	JAVA.IO.PRINTWRITER output(file)

	 PRINT "First Name: "
	 	firstName
	 PRINT "Last Name: "
	 	lastName
	 PRINT "Employee Id Number: "
	 	idNumber
	 PRINT "Date of birth: "
	 	dob
	 PRINT "Employee SSN: "
	 	ssn
	 PRINT "Employee Type: "
	 	type 
	 PRINT "Employee Check: "
	 	employeeCheck()
	 		RETURN total

  }		
}

