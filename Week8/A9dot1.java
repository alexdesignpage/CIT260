public class A9dot1 {

    public static void main(String[] args) {
        // Creates 2 new objects
        Rectangle rectangle1 = new Rectangle(4, 40);
        Rectangle rectangle2 = new Rectangle(3.5, 35.9);
        // Output
        System.out.println("===== Rectangle 1 =====");
        System.out.printf("Area: %.2f %n", rectangle1.getArea());
        System.out.printf("Perimeter: %.2f %n", rectangle1.getPerimeter());
        System.out.println("===== Rectangle 2 =====");
        System.out.printf("Area: %.2f %n", rectangle2.getArea());
        System.out.printf("Perimeter: %.2f %n", rectangle2.getPerimeter());

    }
} // End of A9dot1

/* Rectangle Class
 * Input: takes width and height
 * Output: Returns the area and perimeter of a rectangle
 */
class Rectangle{

    double width = 1;
    double heigth = 1;

    // creates and empty constructor
    Rectangle(){

    }
    // Constructor that creates a rectangle with width and height
    Rectangle(double newWidth, double newHeigth){

        width = newWidth;
        heigth = newHeigth;
    }
    // Method that returns the area
    double getArea(){

        return width * heigth;

    }
    // Method that returns the perimeter
    double getPerimeter(){

        return width + heigth;
    }
}