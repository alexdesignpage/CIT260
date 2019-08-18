import java.util.Scanner;

public class A4dot23 {

    public static void main (String args[]){

        // User inputs
        Scanner input = new Scanner(System.in);
        System.out.print("Enter employee's name: ");
        String name = input.nextLine();
        System.out.print("Enter the number of hours in a week: ");
        double hours = input.nextDouble();
        System.out.print("Enter hourly pay rate: ");
        double rate = input.nextDouble();
        System.out.print("Enter federal tax withholding rate: ");
        double fedTax = input.nextDouble();
        System.out.print("Enter state tax withholding rate: ");
        double stateTax = input.nextDouble();

        System.out.println("================================================");
        // Calculations
        double grossPay = (hours * rate);
        double fedHolding = (grossPay * fedTax);
        double stateHolding = (grossPay * stateTax);
        double total = (fedHolding + stateHolding);
        double netPay = ( grossPay - total);

        // displays the employee payroll
        System.out.printf("Employee Name: " + name +
                "\nHours Worked: " + hours +
                "\nPay Rate: $" + rate +
                "\nGross Pay: $" + grossPay +
                "\nDeductions:" +
                "\n   Federal Withholding (20.0%%): $" + String.format("%3.1f",fedHolding) +
                "\n   State Withholding (9.0%%): $" + String.format("%3.2f", stateHolding) +
                "\n   Total Deduction: $" + String.format("%3.2f", total) +
                "\nNet Pay: $" + String.format("%3.2f", netPay)
                );
    }
}
