
public class CommissionEmployee extends Payroll {

			hoursWorked
			hourlyWage
			overtimeHours
			employeePay
			sales
			percentageOfSales
	
			// no-arg constructor which creates a default CommissionEmployee
			PUBLIC CommissionEmployee ()
			
			
			//Use the variables passed into the method when called, and place the new values into the same variables.
			PUBLIC CommissionEmployee (hoursWorked, hourlyWage, overtimeHours, employeePay, sales, percentageOfSales) 
				
			
			
			//gets the private variable hoursWorked and returns it to be used.
			PUBLIC getHoursWorked
				RETURN hoursWorked
			
			
			//gets the private variable hourlyWage and returns it to be used. 
			PUBLIC getHourlyWage
				RETURN hourlyWage 
			
			
			//gets the private variable overtimeHours and returns it to be used.
			PUBLIC getOvertimeHours
				RETURN overtimeHours
			
			//gets the private variable employeePay and returns it to be used.
			PUBLIC getEmployeePay
				RETURN employeePay
			
			//gets the private variable employeePay and returns it to be used.
			PUBLIC getSales
				RETURN sales
		
			//gets the private variable employeePay and returns it to be used.
			PUBLIC getPercentageOfSales
				RETURN percentOfSales
			
			//take the value passed into the method in variable hoursWorked, and set the private variable hoursWorked to the new value.
			PUBLIC setHoursWorked (hoursWorked)
				hoursWorked = hoursWorked
			
			
			//take the value passed into the method in variable hoursWorked, and set the private variable hourlyWage to the new value.
			PUBLIC setHourlyWage (hourlyWage)
				hourlyWage = hourlyWage
			
			//take the value passed into the method in variable overtimeHours, and set the private variable overtimeHours to the new value.
			PUBLIC setOvertimeHours (overtimeHours)
				overtimeHours = overtimeHours
			
			//take the value passed into the method in variable employeePay, and set the private variable overtimeHours to the new value.
			PUBLIC setEmployeePay (employeePay)
				employeePay = employeePay
	
			//take the value passed into the method in variable sales, and set the private variable sales to the new value.
			PUBLIC setSales (sales)
				sales = sales
				
			//take the value passed into the method in variable sales, and set the private variable sales to the new value.
			PUBLIC setPercentageOfSales (percentOfSales)
				percentageOfSales = percentageOfSales
				
				
			//Method to calculate the employees paycheck based on hours worked, their wage, and if they worked overtime hours. 
			PUBLIC employeesCheck()
				employeePay // Double Variable 
				sales // Int variable 
				percentageOfSales // Double Variable 
				
				IF hoursWorked > 40
				employeePay = 40 * hourlyWage + hoursWorked - 40 * hourlyWage * 1.5
					IF sales < 300
						percentageOfSales = 0
					
					ELSE IF sales < 600 
						percentageOfSales = 0.02
					
					ELSE IF sales < 1000
						percentageOfSales = 0.025
					
					ELSE
						percentageOfSales = 0.03
					
				
				RETURN employeePay * percentageOfSales
				
				
				ELSE 
					employeePay = hoursWorked * hourlyWage
					IF sales < 300 
						percentageOfSales = 0
					
					ELSE sales < 600
						percentageOfSales = 0.02
					
					ELSE IF sales < 1000 
						percentageOfSales = 0.025
					
					ELSE
						percentageOfSales = 0.03
						
					RETURN employeePay * percentageOfSales
				
		