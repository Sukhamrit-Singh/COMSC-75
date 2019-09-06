//  Sukhamrit Singh
//  Shipping
/*
This program asks for the weight of the package
and display the shipping cost.  The program will
determine the costs using the "if" statements
displayed in the code.
 */

//  Importing library to get user input
import java.util.Scanner;

public class Shipping {
    public static void main(String[] args) {
        //  Variable that defines the cost
        double cost;

        //  Variable to keep shipping next item
        boolean keepShipping = true;

        //  Loop continuing to the next shipping item
        while (keepShipping) {

            //  Displays a title to enter the cost of package
            System.out.print("Enter weight of package in pounds: ");

            //  Made a scanner to get user input
            Scanner input = new Scanner(System.in);

            //  Turns the users inputted number into a variable
            double pounds = input.nextDouble();

            /*  If statements determining the cost of
            packages based on pounds, also prints cost
            */
            if (pounds > 20) {
                System.out.println("The package cannot be shipped");
            } else if (pounds > 10) {
                cost = 10.50;
                System.out.println("Cost: $" + cost + "0");
            } else if (pounds > 3) {
                cost = 8.50;
                System.out.println("Cost: $" + cost + "0");
            } else if (pounds > 1) {
                cost = 5.50;
                System.out.println("Cost: $" + cost + "0");
            } else if (pounds > 0) {
                cost = 3.50;
                System.out.println("Cost: $" + cost + "0");
            } else
                System.out.println("Invalid input");

            //  Displays a space after the cost
            System.out.println("");


        }
    }
}