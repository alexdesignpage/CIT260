import java.util.Scanner;

public class A4dot12 {

    public static void main(String args[]){
        // creates a scanner name input
        Scanner input =  new Scanner(System.in);
        // prompts the user to enter something
        System.out.print("Enter a hex digit: ");
        // Will need to use a String to check it
        String hex = input.nextLine();
        // Since a Hex is ony one character, we need to check if what the user input is one char
        // if the length of hex is not 1, then end the program
        if ( hex.length() != 1) {
            System.out.print("Please use one digit at a time!");
            System.exit(1);
        }
        // returns the value at index 0 from index, meaning the Hex
        char digit = hex.charAt(0);
        // if digit is lower case, try again!
        if (digit >= 'a' && digit <= 'f'){
            System.out.println("Please, enter capital letters for Hex digit!");
        }
        // checks if the Digit is a letter OR if its a number between 0 and 9
        if ((digit >= 'A' && digit <= 'F') || (digit >= '0' && digit <= '9')){
            System.out.print("The Binary value is ");
            switch(digit){
                case '0': System.out.println("0000");
                    break;
                case '1': System.out.println("0001");
                    break;
                case '2': System.out.println("0010");
                    break;
                case '3': System.out.println("0011");
                    break;
                case '4': System.out.println("0100");
                    break;
                case '5': System.out.println("0101");
                    break;
                case '6': System.out.println("0110");
                    break;
                case '7': System.out.println("0111");
                    break;
                case '8': System.out.println("1000");
                    break;
                case '9': System.out.println("1001");
                    break;
                case 'A': System.out.println("1010");
                    break;
                case 'B': System.out.println("1011");
                    break;
                case 'C': System.out.println("1100");
                    break;
                case 'D': System.out.println("1101");
                    break;
                case 'E': System.out.println("1110");
                    break;
                case 'F': System.out.println("1111");
                break;
            }
        }
     else
            System.out.println(digit + " is not a Hex digit!");
    }
}
