import java.util.Scanner;

public class A2dot2 {

    public static void main(String args[]){

        final double PII = 3.14159;

        Scanner input  =  new Scanner(System.in);
        System.out.println("Enter the radius and length of a  cylinder: ");
        double radius = input.nextDouble();
        double length =  input.nextDouble();
        double area = (radius * radius) * PII;
        double volume = area * length;

        System.out.format("The area is %5.4f%n" ,area);
        System.out.format("The volume is %5.1f%n", volume);

    }

}
