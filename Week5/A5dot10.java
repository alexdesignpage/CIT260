public class A5dot10 {

    public static void main(String args[]){

        System.out.println("List of numbers divisible by 5 & 6 between 100 and 1000");
        System.out.println("-------------------------------------------------------");
        // counts numbers in the loop
        int count = 0;
        // start index from 100, to 1000 , one by one
        for (int i = 100; i <= 1000; i++){
            // if i is divisible by 5 AND 6 ...
            if ( i % 5 == 0 && i % 6 ==0){
                // counts every number divisible
                count++;
                // counts if numbers per line is 10
                if(count % 10 == 0){
                    // prints last number in the line of 10
                    System.out.println(i);
                } // print numbers divisible by 5 & 6 with a space in between
                else {
                    // print number 1 - 9 in the line of 10
                    System.out.print(i + " ");
                }
            }
        }
    }
}