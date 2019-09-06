//  Sukhamrit Singh
//  Polygon Test
/*
The program will create three RegularPolygon objects, created using:
The no-argument constructor
RegularPolygon(6, 4)
RegularPolygon(10, 4, 5.6, 7.8)
For each object, display its perimeter and area, properly labeled.
 */

public class PolygonTest {
    public static void main(String[] args) {

        //  Displays the first polygon
        System.out.println("Polygon 1");

        //  Creating a new polygon from the class
        //  Default shape
        RegularPolygon shape1 = new RegularPolygon();

        //  Prints the perimeter and area of the polygon
        System.out.println("Perimeter: " + shape1.getPerimeter());
        System.out.printf("Area: %.2f", shape1.getArea());

        //  Displays an empty line
        System.out.println("");
        System.out.println("");

        //  Displays the second polygon
        System.out.println("Polygon 2");

        //  Creating a new polygon from the class
        //  Second Polygon with side and lenght only
        RegularPolygon shape2 = new RegularPolygon(6, 4);

        //  Prints the perimeter and area of the polygon
        System.out.println("Perimeter: " + shape2.getPerimeter());
        System.out.printf("Area: %.2f", shape2.getArea());

        //  Displays an empty line
        System.out.println("");
        System.out.println("");

        //  Displays the third polygon
        System.out.println("Polygon 3");

        //  Creating a new polygon from the class
        //  Third Polygon with side, length, coordinates
        RegularPolygon shape3 = new RegularPolygon(10, 4, 5.6, 7.8);

        //  Prints the perimeter and area of the polygon
        System.out.println("Perimeter: " + shape3.getPerimeter());
        System.out.printf("Area: %.2f", shape3.getArea());
    }
}

//  Creating a new class
class RegularPolygon {

    //  Defined the data fields
    private int n;
    private double side;
    private double x;
    private double y;


    //  Created a no-argument constructor
    RegularPolygon() {

        //  Set the data-fields to default values
        this(3, 1.0);
    }

    /*
    Created a constructor that creates a regular
    polygon with the specified number of sides and
    length of side
     */
    RegularPolygon(int side, double length) {

        //  Set the data-fields to different values
        this(side, length, 0.0, 0.0);

    }

    /*
    Created a constructor that creates a regular
    polygon with the specified number of sides,
    length of side, and x-and y- coordinates
     */
    RegularPolygon(int side, double length, double x, double y) {

        //  Set the data-fields to different values
        this.n = side;
        this.side = length;
        this.x = x;
        this.y = y;

    }

    /*
    Generates the getter and setter
    methods for the data fields
     */
    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    //  Created a constructor method
    public double getPerimeter() {

        //  Defined the variable perimeter
        double perimeter = n * side;

        //  Returned perimeter
        return perimeter;
    }

    //  Created a constructor method
    public double getArea() {

        //  Defined the variable area
        double area = n * Math.pow(side, 2) /
                (4 * Math.tan(Math.PI / n));

        //  Returned area
        return area;
    }
}

