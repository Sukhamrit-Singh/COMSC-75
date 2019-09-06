//  Sukhamrit Singh
//  Temperature
/*
This program will read a Celsius degree in a
double value from the console, and then convert
it to Fahrenheit.  The result will be displayed
formatted to two decimal places along with a
message. If the temperature in Fahrenheit is
less than 65 degrees, print the message "Please
wear a coat." If the temperature in Fahrenheit
is 65 to 75 degrees, print "It is perfect weather."
Otherwise, print the message "Please bring a
swimsuit."
 */

//  Imports the scanner library for user input
import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {

        //  Loop to keep getting user input
        while (true) {
            //  Creating the scanner variable
            Scanner input = new Scanner(System.in);

            //  Displays text to enter degrees Celsius
            System.out.print("Enter a degree in Celsius: ");

            //  Variable defining the scanner object
            double inputtedDegrees = input.nextDouble();

            //  Variable turning user input into Fahrenheit
            double intoFahrenheit = (9.0 / 5) * inputtedDegrees + 32;

            /*
              If statement displaying messages depending on
              the degrees fahrenheit
             */
            if (intoFahrenheit < 65) {
                /*
                  Displays the degrees into fahrenheit and
                  clothing message
                 */
                System.out.print(inputtedDegrees + " ");
                System.out.printf("Celsius is %.2f", intoFahrenheit);
                System.out.println(" Fahrenheit");
                System.out.println("Please wear a coat.");
            } else if (intoFahrenheit > 75) {
                 /*
                  Displays the degrees into fahrenheit and
                  clothing message
                 */
                System.out.print(inputtedDegrees + " ");
                System.out.printf("Celsius is %.2f", intoFahrenheit);
                System.out.println(" Fahrenheit");
                System.out.println("Please bring a swimsuit.");
            } else {
                 /*
                  Displays the degrees into fahrenheit and
                  clothing message
                 */
                System.out.print(inputtedDegrees + " ");
                System.out.printf("Celsius is %.2f", intoFahrenheit);
                System.out.println(" Fahrenheit");
                System.out.println("It is perfect weather.");
            }

            //  Displays an empty line
            System.out.println("");
        }
    }
}
