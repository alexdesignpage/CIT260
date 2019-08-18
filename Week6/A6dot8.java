public class A6dot8 {
    public static void main(String[] args){
        // Displays table
        System.out.println("   Celsius   |   Fahrenheit   ");

        /* Source used: https://stackoverflow.com/questions/26732846/how-to-count-from-10-to-1-in-java */
        for (double celsius = 40.0; celsius >= 31.0; celsius--){

            // Displays results and calls celsiusToFahrenheit method
            System.out.printf("%8.1f", celsius);
            System.out.printf("%15.1f\n", celsiusToFahrenheit(celsius));

        }
        // Displays second table
        System.out.println("================================");
        System.out.println(" ");
        System.out.println("   Celsius   |   Fahrenheit   ");

        for(double fahrenheit = 120.0; fahrenheit >= 30.0; fahrenheit-=10){
            // Displays results and calls fahrenheitToCelsius method
            System.out.printf("%8.1f", fahrenheit);
            System.out.printf("%15.2f\n",fahrenheitToCelsius(fahrenheit));

        }
    }
    /** Convert from Celsius to Fahrenheit */
    public static double celsiusToFahrenheit(double celsius){

        return (9.0 / 5) * celsius + 32;
    }

    /** Convert from fahrenheit to celsius */
    public static double fahrenheitToCelsius(double fahrenheit){

        return (5.0 / 9) * (fahrenheit - 32);
    }
}
