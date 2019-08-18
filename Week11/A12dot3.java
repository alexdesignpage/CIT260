import java.util.Scanner;

public class A12dot3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // gets index from method
        int array[] = getArray();
        int x = 1;

        do {
            try {
                // User input
                System.out.print("Enter index of array: ");
                // displays the random element value of the array
                System.out.println("The Element value is " + array[input.nextInt()]);
                x = 2;
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Out of Bounds!");
            }
        } while( x == 1);
    }
/* INPUT: creates an array of 100
 * OUTPUT: returns a random integer
 */
    private static int[] getArray() {
        int array[] = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()* 100);
        }
        return array;
    }
}