import java.util.Scanner;

public class A7dot8 {
    public static void main(String[] args){

        // Scans for user input
        Scanner input = new Scanner(System.in);
        // Asks user to enter some data
        System.out.print("Please enter 10 double values: ");
        // creates a new array of size 10
        double array[] =  new double[10];
        // loops through the array
        for ( int i =0; i < array.length; i++ ){
                // inserts elements from the array
                array[i] = input.nextDouble();
                //System.out.println(array[i]); just to test the array
        }
        // Displays the average...
        System.out.print("Average: " + average(array));
    }
    public static int average(int[] array){
        /* I was using this but I actually refactor my code to make it more clean
        int avg = 0;
        for(int i =0; i < array.length; i++){
            avg = avg = array[i];
        }
        return avg / array.length;
         */
        /* Source used: https://stackoverflow.com/questions/12002332/how-to-manipulate-arrays-find-the-average-beginner-java */

        // initialize sum to 0
        int sum = 0;
        // better for loop to use
        for(int i : array)
            // add the index value to the sum
            sum += i;
        // returns the average
        return sum / array.length;

    }

    public static double average(double[] array){
        // same as above but in type double
        double sum = 0;
        for(double i : array)
            sum += i;
        return sum / array.length;


    }
}