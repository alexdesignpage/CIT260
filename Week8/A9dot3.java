public class A9dot3 {
    public static void main(String[] args){
       // Chapter 9.6.1
       java.util.Date date = new java.util.Date();

        for (long i = 10; i <= 100000000000L; i *= 10) {
            date.setTime(i);
            System.out.println(date.toString());
        }
    }
}

