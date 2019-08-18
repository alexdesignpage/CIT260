//
	public class HourlyEmployee extends Payroll {

		
		//private variable with a decimal point for the number of hours the employee has worked
		hoursWorked
		
		//private variable with a decimal point for the wage the employee earns per hour
		hourlyWage
		
		//private variable with a decimal point for when the employee works more then 40 hours a week
		overtimeHours
		
		// no-arg constructor which creates a default HourlyEmployee
		PUBLIC HourlyEmployee() 
		
		
		//Use the variables passed into the method when called, and place the new values into the same variables.
		PUBLIC HourlyEmployee (hoursWorked, hourlyWage, overtimeHours)
			
			hoursWorked = hoursWorked
			hourlyWage = hourlyWage
			overtimeHours = overtimeHours
		
		//gets the private variable hoursWorked and returns it to be used.
		PUBLIC getHoursWorked() 
			RETURN hoursWorked
		
		//gets the private variable hourlyWage and returns it to be used.
		PUBLIC getHourlyWage() 
			RETURN hourlyWage
		
		//gets the private variable overtimeHours and return it to be used.
		PUBLIC getOvertimeHours() 
			RETURN overtimeHours
		
		//take the value passed into the method in variable hoursWorked, and set the private variable hoursWorked to the new value.
		PUBLIC setHoursWorked (hoursWorked)
			hoursWorked = hoursWorked
		
		//take the value passed into the method in variable hoursWorked, and set the private variable hourlyWage to the new value.
		PUBLIC setHourlyWage (hourlyWage)
			hourlyWage = hourlyWage
		
		//take the value passed into the method in variable overtimeHours, and set the private variable overtimeHours to the new value.
		PUBLIC setOvertimeHours (overtimeHours)
			overtimeHours = overtimeHours
		
		//Method to calculate the employees paycheck based on hours worked, their wage, and if they worked overtime hours. 
		//Determine if the employee worked more then 40 hours, if so times the employees wage by 1.5 for the overtime hours worked and return the value.
		//If the employee didn't work over 40 hours, return the value of the hours worked * their wage.
		PUBLIC employeesCheck() 
			
			IF hoursWorked > 40
			overtimeHours = 40 * hourlyWage + hoursWorked - 40 * hourlyWage * 1.5
			
			RETURN overtimeHours
			
			ELSE
				overtimeHours = hoursWorked * hourlyWage
				
			RETURN overtimeHours