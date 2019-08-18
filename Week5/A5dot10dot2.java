public class A5dot10dot2 {

    public static void main(String args[]){

        int count = 0;
        int i = 0;

        while (count < 100){

            if (i % 5 == 0 && i % 6 == 0){
                count++;
                if ( count % 10 == 0){
                    System.out.println(count);
                }
                else {
                    System.out.print( count + " ");
                }
            }
        }
    }
}
