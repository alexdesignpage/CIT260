import java.util.Scanner;

public class A2dot5 {
    public static void main(String args[]){

        Scanner input =  new Scanner(System.in);

        System.out.println("Enter the subtotal and gratuity rate: ");
        double subtotal = input.nextDouble();
        double gratiuty = input.nextDouble();
        double gratiutyRate = gratiuty / 10;
        double total = subtotal + gratiutyRate;

        System.out.println("The gratuity is $" + gratiutyRate +  " and the total is $" + total);

    }

}
