public class A10dot4 {

    public static void main(String[] args){

        // We need to create two object points
        MyPoint point1 = new MyPoint();
        MyPoint point2 = new MyPoint(10.0, 30.5);
        // display distance
        System.out.println("==========RESULTS==========");
        System.out.println("Point 1: (" + point1.getX() + ", " + point1.getY() + ")");
        System.out.println("Point 2: (" + point2.getX() + ", " + point2.getY() + ")");
        System.out.printf("Distance: %.3f", point1.distance(point2));
    }
}
/* My Point class:
 * Input: gets two points
 * Returns: the distance
 */
class MyPoint{
// private variables so they wont be change from outside the class
    private double x;
    private double y;
// Default constructor creates point (0,0)
    MyPoint(){
        this(0,0);
    }
// Constructor that constructs a point to x and y
    MyPoint(double x, double y){
        this.x = x;
        this.y = y;
    }
// Getters for x and y methods

    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }

    /* Distance Overload Methods:
     * Input: takes two points X and Y
     * Output: Returns the distance of the two points
     * Distance Formula: (X2 - x1)^2 +(Y2 - Y1)^2
     * Source Used : https://stackoverflow.com/questions/20916953/get-distance-between-two-points-in-canvas
     */
    public double distance(MyPoint myPoint){
        double distance = Math.sqrt(Math.pow(myPoint.getX() - x, 2) + Math.pow(myPoint.getY() -y,2));
        return distance;
    }

    // returns the distance from THIS point to another point with specified x- and y coordinates

    public double distance(double x, double y){

        double distance = distance(new MyPoint(x,y));
        return distance;

    }
}