public class A5dot3 {

    public static void main(String args[]){

        // 1 Kilogram is 2.2 pounds
        final double pondsToKilogram = 2.2;
        System.out.println(" Kilograms                      Pounds");

        // index start 1, counts to 199
        for(int i = 1; i <= 199; i++) {
            // if i remainder is not equals to 0
            if (i % 2 != 0) {
                // process math to find ponds to kilogram from each loop
                double result = i * pondsToKilogram;
                System.out.println("|------------------------------------------|");
                // prints out table ................................................... round to two decimals
                System.out.println("    " + i + "                           " + Math.round(result * 10) / 10.0);
            }
        }
    }
}
