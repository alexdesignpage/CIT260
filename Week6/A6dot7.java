import java.util.Scanner;

public class A6dot7 {

    public static void main(String[] args) {
        // user's input...
        Scanner input = new Scanner(System.in);
        System.out.print("The Amount Invested: ");
        double invested = input.nextDouble();
        System.out.print("Annual Interest Rate: ");
        double annualInterestRate = input.nextDouble();

        // Calculate monthly rate by dividing annual by 12 and divide by 100 to make it to percentage
        double monthlyInterestRate = (annualInterestRate / 12) / 100;
        // Display table
        System.out.println("Years    Future Value");

        // loop from 1 to 30
        for(int i = 1; i <= 30; i++){
            //Display results
            // https://www.javatpoint.com/java-string-format
            System.out.printf("%3d", i);
            System.out.printf("%15.2f\n", futureInvestmentValue(invested, monthlyInterestRate, i));

        }
    }

    /* Future Investment Formula
     * Input: Investment Amount, Monthly Interest Rate, years
     * Output: Future Investment
     * Formula: FV1 = PV(1 + !)^n
     * Where PV = Present value, ! interest rate, n number of
     * compounding periods(years)
     * Source: https://www.thebalancesmb.com/how-to-calculate-the-future-value-of-an-investment-393391
     */
    private static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {

        return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);

    }
}