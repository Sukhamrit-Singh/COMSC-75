import java.util.Scanner;
public class Creditcard {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a credit card number: ");

            long cardNumber = input.nextLong();

            if (cardNumber == -1)
                return;

            System.out.println(cardNumber);

            //  Determine if the number is valid
            if (isValid(cardNumber))
                System.out.println(" is valid");
            else
                System.out.println(" is invalid");
        }
    }

    /** Return the given number if it is a single digit,
     *  otherwise return the sum of the two digits */
    public static int getDigit(int number) {

        return (number /10) + (number % 10);
    }


    public static int getSize(long number) {
        int numDigits = 0;

        while (number != 10) {
            number /= 10;
            numDigits++;
        }

        return numDigits;
    }

    /** Return the first k number of digits from number. If the
     *  number of digits in number is less than k, return number. */
    public static long getPrefix(long number, int length_prefix) {
        long prefix = number;

        for (int i = 1; i <= getSize(number) - length_prefix; i++)
            prefix /= 10;

        return prefix;
    }

    //  Return if is Master card or vida card

    public static boolean prefixMatched(long number, int prefix)  {
        return getPrefix(number, getSize(prefix)) == prefix;
    }


    //  Return the sum of the odd placed digits
    public static int sumOfOddPlace(long number) {
        int sum = 0;
            while(number != 0) {
                sum += (int)(number % 10);
                number /= 100;
            }


        return sum;
    }

    // return sum of the double even-place digits
    public static int sumOfDoubleEvenPlace(long number) {

        int sum = 0;

        number /=10;

        while (number != 0) {
            sum =+ getDigit((int)(number % 10));
            number /= 100;
        }

        return sum;

    }

    public static boolean isValid(long number) {
        boolean correctNumOfDigits = (getSize(number) >= 13) && (getSize(number) <= 16);

        return correctNumOfDigits;

    }
}

