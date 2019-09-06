//  Sukhamrit Singh
//  Fahrenheit
/*
This is a program that turn
degrees celsius into degrees
fahrenheit
 */


import java.util.Scanner;

public class Fahrenheit {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("Enter a temperature in degrees celsius");
        System.out.print("Enter here: ");

        int degreesCelsius = input.nextInt();

        double intoFahrenheit = (1.8 * degreesCelsius) + 32;

        System.out.println(degreesCelsius + " degrees celsius is " + intoFahrenheit + " degrees fahrenheit");

        if (intoFahrenheit > 90) {
            System.out.println("Bring sun screen");
        } else {
            System.out.println("Bring a jacket");
        }
    }
}
