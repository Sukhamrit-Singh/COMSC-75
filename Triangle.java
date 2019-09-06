//  Sukhamrit Singh
//  Triangle
/*
This program asks for the lengths of the three
sides of a triangle and computes the perimeter
if the input is valid.  The input is valid if
the sum of every pair of two sides is greater
than the remaining side.
 */

//  Importing library to get user input
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args){

        //  Variable that defines the perimeter
        double perimeter;

        //  Variable to keep getting user input
        boolean loop = true;

        //  Loop continuing to the next sides
        while (loop) {
            //  Made a scanner to get user input
            Scanner input = new Scanner(System.in);

            //  Displays a title to enter the sides of the triangle
            System.out.print("Enter lengths of sides of the "
                    + "triangle: ");

            //  Turns the users inputted numbers into variables
            double side1 = input.nextDouble();
            double side2 = input.nextDouble();
            double side3 = input.nextDouble();

             /*  If statements determining the perimeter of
             the triangle if input is valid, if not valid,
             prints statement
             */
            if (side1 + side2 > side3 && side2 + side3 >
                    side1 && side1 + side3 > side2) {
                perimeter = side1 + side2 + side3;
                System.out.println("The perimeter of the triangle is "
                        + perimeter);
            } else {
                System.out.println("Those sides do not specify a valid "
                        + "triangle");
            }

            //  Displays a space after the result
            System.out.println("");
        }



    }
}
