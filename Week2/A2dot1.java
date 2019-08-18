import java.util.Scanner;

public class A2dot1 {

    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a degree in Celsius: ");
        int celsius = input.nextInt();
        double fahrenheit = (9.0 / 5) * celsius + 32;
        System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");

    }
}
