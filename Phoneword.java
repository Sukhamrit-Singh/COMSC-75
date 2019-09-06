//  Sukhamrit Singh
//  Phoneword
/*
This program prompts the user for a “phone word,”
an alphabetic mnemonic for a phone number.
Then, print out the phone number corresponding
to that sequence.
 */

//  Imports library for user input
import java.util.Scanner;

public class Phoneword {
    public static void main(String[] args) {

        //  Loop to keep getting user input
        while (true) {
            //  Made a scanner
            Scanner input = new Scanner(System.in);

            //  Displays Text
            System.out.print("Enter Word here: ");

            //  The users input
            String userWord = input.nextLine();

            //  Turns the input into all caps
            userWord = userWord.toUpperCase();

            //  Replaces all special characters
            userWord = userWord.replaceAll("[^a-zA-Z0-9]", "");

            //  If statement for string length
            if (userWord.length() < 7) {

                //  Displays message
                System.out.println("Your phone word is not long enough " +
                        "for a phone number");
                System.out.println("");
                continue;
            }

            //  For loop to turn string to characters
            for (int i = 0; i < 7; i++) {
                char c = userWord.charAt(i);

                //  Switch statement for turning characters to numbers
                switch (c) {
                    case 'A':
                    case 'B':
                    case 'C':
                        System.out.print("2");
                        break;
                    case 'D':
                    case 'E':
                    case 'F':
                        System.out.print("3");
                        break;
                    case 'G':
                    case 'H':
                    case 'I':
                        System.out.print("4");
                        break;
                    case 'J':
                    case 'K':
                    case 'L':
                        System.out.print("5");
                        break;
                    case 'M':
                    case 'N':
                    case 'O':
                        System.out.print("6");
                        break;
                    case 'P':
                    case 'Q':
                    case 'R':
                    case 'S':
                        System.out.print("7");
                        break;
                    case 'T':
                    case 'U':
                    case 'V':
                        System.out.print("8");
                        break;
                    case 'W':
                    case 'X':
                    case 'Y':
                    case 'Z':
                        System.out.print("9");
                        break;
                    default:
                        System.out.print(c);

                }

                //  If statement to print "-"
                if (i == 2) {
                    System.out.print("-");
                }



            }
            //  Displays two empty lines
            System.out.println("");
            System.out.println("");

        }

    }
}
