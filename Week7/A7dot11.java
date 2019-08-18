import java.util.Scanner;

public class A7dot11 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Ask user to enter some data
        System.out.print("Enter 10 numbers: ");
        //creates an array of size 10
        double array[] = new double[10];
        // loops through the array
        for (int i = 0; i < array.length; i++){
            //places index of array
            array[i] = input.nextDouble();
        }
        // Displays results to user, uses printf to format it
        System.out.printf("Mean: %.2f %n", mean(array));
        System.out.printf("Deviation: %.5f %n", deviation(array));
    }
/** Source Used: https://www.programiz.com/java-programming/examples/standard-deviation */
// Compute the deviation for double values
    public static double deviation(double[] x){
        // initialize deviation to 0
        double deviation = 0;
        // n - 1
        int length = x.length - 1;
        // calls the mean method
        double m = mean(x);
        // loops through the array
        for(double i: x) {
            // xi - mean
            deviation += Math.pow(i - m, 2);
        }
        return Math.sqrt(deviation / length);

    }
// Used same code as previous assignment, median and average is the same thing...
    public static double mean(double[] x){
        // initialize sum to 0
        double sum = 0;
        // loops
        for(double i : x)
            //adds the index value to sum
            sum += i;
        // returns the average
        return sum / x.length;
    }
}
