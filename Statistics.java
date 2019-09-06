//  Sukhamrit Singh
//  Statistics
/*
This is a program that repeatedly asks a user
to enter a priceof an item or -1 when finished.
When the user enters -1, your program will compute
and display the total number of items, the average
price, and the standard deviation of the prices.
If the user enters -1 right away, print a message
that you cannot calculate any statistics. If the
user enters only one number, calculate the average,
but give a message that you cannot calculate a
standard deviation
 */

//  Imports the necessary libraries
import java.util.LinkedList;
import java.util.Scanner;

public class Statistics {
    public static void main(String[] args) {

        //  Loop to keep gathering data
        while (true) {
            //  Defines variable for number of items
            int itemCount = 0;

            // Variable for total price
            double totalPrice = 0;

            //  loop to keep going if not -1
            boolean loop = true;

            //  average of items
            double average = 0;

            //  Variable for standard deviation
            double standardDeviation;

            //  Lined list to store umber of items
            LinkedList<Double> prices = new LinkedList<Double>();

            //  Scanner for users input
            Scanner input = new Scanner(System.in);

            //  Loop that keeps running until -1
            while (loop) {

                //  If statement for number of items
                if (itemCount == 0) {
                    System.out.print("Enter first price, or -1 to quit: $");
                } else {
                    System.out.print("Enter next price, or -1 to quit: $");
                }

                //  Scanner item for user input
                double price = input.nextDouble();

                //  If statement for if user enters -1
                if (price == -1) {

                    //  Displays an empty line
                    System.out.println("");

                    //  If statement to display for number of items
                    if (itemCount == 0) {
                        System.out.println("Number of items: 0");
                        System.out.println("No data entered. Cannot calculate statistics.");

                    } else if (itemCount == 1) {
                        average = totalPrice / itemCount;
                        System.out.println("Number of items: 1");
                        System.out.printf("Average price: $%.2f \n", average);
                        System.out.println("Cannot calculate standard deviation for one item");

                    } else {
                        average = totalPrice / itemCount;
                        System.out.println("Number of items: " + itemCount);
                        System.out.printf("Average price: $%.2f", average);
                    }

                    //  Turns the loop off, so ends cycle if -1
                    loop = false;

                } else {
                    //  If not -1, does these operations
                    itemCount++;
                    totalPrice += price;
                    prices.add(price);

                }
            }

            //  Prints empty line
            System.out.println("");

            //  If statement is number of items is 1
            if (itemCount > 1) {

                //  Defines a variable standard sum
                double standardSum = 0;

                //  For loop to get standard sum for standard deviation
                for (int i = 0; i < prices.size(); i++) {
                    double p = prices.get(i);
                    standardSum += Math.pow(p - average, 2);
                }

                //  Defining standard deviation
                standardDeviation = Math.sqrt(standardSum / (itemCount - 1));

                //  Prints the standard deviation
                System.out.printf("Standard deviation of prices is $%.2f", standardDeviation);

            }

            //  Leaves two lines empty
            System.out.println("");
            System.out.println("");
        }
    }

}
