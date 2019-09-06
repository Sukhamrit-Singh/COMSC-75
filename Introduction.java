//  Sukhamrit Singh
//  Introduction
/*
This is a program that shows my name, my favorite short poem,
the author of the poem, my age in years, my age in days,
and the product of my favorite number, 123456789, and 9
 */

public class Introduction {
    public static void main(String[] args) {
        //  Constant that declares how many days there are in a year
        final int DAY_IN_YEAR = 365;

        //  Constant that declares the number 12345679
        final int MAGIC_NUMBER = 12345679;

        //  Constant that declares my favorite number
        int favoriteNumber = 7;

        //  My age in years
        int ageInYears = 14;

        //  My age in days
        int ageInDays = ageInYears * DAY_IN_YEAR;

        //  Product Of Three Numbers
        int product = MAGIC_NUMBER * favoriteNumber * 9;

        //  Displays my name
        System.out.println("My name is Sukhamrit Singh");
        System.out.println("");

        //  Displays the short poem
        System.out.println("Curtains forcing their will");
        System.out.println("against the wind,");
        System.out.println("children sleep,");
        System.out.println("exchanging dreams with");
        System.out.println("seraphim. The city");
        System.out.println("drags itself awake on");
        System.out.println("subway straps; and");
        System.out.println("I, an alarm, awake as a");
        System.out.println("rumor of war");
        System.out.println("lie stretching into dawn");
        System.out.println("unasked and unheeded.");

        //  Displays Author
        System.out.println("    --MAYA ANGELOU");

        //  Displays My Age In Years
        System.out.println("");
        System.out.println("Age In Years: " + ageInYears);

        //  Displays My Age In Days
        System.out.println("Age In Days: " + ageInDays);

        //  Displays Product Of Three Numbers
        System.out.println("Product: " + product);
    }

}
