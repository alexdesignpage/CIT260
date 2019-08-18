import java.util.InputMismatchException;
import java.util.Scanner;

public class A12dot2 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int x = 1; // to be able to use the do while loop
        do{
            try{
                // User input
                System.out.print("Enter first integer:");
                int numb1 =  input.nextInt();
                System.out.print("Enter second integer:");
                int numb2 = input.nextInt();
                // Sum both integers
                System.out.println("Sum: " + ( numb1 + numb2));
                // exits loop if everything enter is an integer
                x = 2;
            }
            catch (InputMismatchException e){
                System.out.println("Please try again and enter integers only!");
                input.nextLine();
            }
        } while ( x == 1);
    }
}
