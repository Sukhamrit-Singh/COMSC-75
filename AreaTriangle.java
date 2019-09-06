//  Sukhamrit Singh
//  AreaTriangle
/*
 This is a program that lets the
 user enter three coordinates of
 a triangle, which then the
 computer finds the area by using
 Heron's Area Formula.
*/

//  Imported scanner for user input
import java.util.Scanner;

public class AreaTriangle {
    public static void main(String[] args) {
        //  Made a scanner to get user input
        Scanner input= new Scanner(System.in);

        //  Displays a title to enter coordinates
        System.out.println("Enter the coordinates of three points separated by spaces");

        //  Displays an example of formatting
        System.out.print("like x1 y1 x2 y2 x3 y3: ");

        //  Turns the users inputted coordinates into variables
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        //  Functions to find the difference between the x values
        double subtractX1 = x1 - x2;
        double subtractX2 = x2 - x3;
        double subtractX3 = x1 - x3;

        //  Functions to find the difference between the y values
        double subtractY1 = y1 - y2;
        double subtractY2 = y2 - y3;
        double subtractY3 = y1 - y3;

        //  Functions to find the three different sides
        double side1 = Math.sqrt((Math.pow(subtractX1, 2)) + (Math.pow(subtractY1, 2)));
        double side2 = Math.sqrt((Math.pow(subtractX2, 2)) + (Math.pow(subtractY2, 2)));
        double side3 = Math.sqrt((Math.pow(subtractX3, 2)) + (Math.pow(subtractY3, 2)));

        //  Function to find the semi-perimeter, "S"
        double semiPerimeter = (side1 + side2 + side3) / 2;

        //  Function to find the area of the triangle
        double area = Math.sqrt(semiPerimeter * (semiPerimeter - side1) *
                (semiPerimeter - side2) * (semiPerimeter - side3));

        //  Displays the Area of the triangle to the user
        System.out.printf ("The Area Of The Triangle Is %.1f \n", area);
    }
}
