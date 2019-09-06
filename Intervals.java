//  Sukhamrit Singh
//  Intervals
/*
This program will take two time intervals (a starting
and ending time) and compare them. The program first
prompts the user for an earlier and later interval.
The program will then calculate how many minutes are
in each interval, which one is longer, and whether the
intervals overlap.
 */

//  Importing library to get user input
import java.util.Scanner;

public class Intervals {
    public static void main(String[] args) {
        //  Variable to keep getting user input
        boolean loop = true;

        //  Loop continuing to the next times
        while (loop) {
           //  Made 2 scanners to get user input
           Scanner input1= new Scanner(System.in);
           Scanner input2= new Scanner(System.in);

           //  Displays a title to enter the times
           System.out.print("Enter earlier start and end " +
                   "time as two 24-hour format times: ");

           //  Turns the users inputted data into variables
           int earlyTime1 = input1.nextInt();
           int earlyTime2 = input1.nextInt();

           //  Displays a title to enter the times
           System.out.print("Enter later start and end time as " +
                   "two 24-hour format times: ");

           //  Turns the users inputted data into variables
           int lateTime1 = input2.nextInt();
           int lateTime2 = input2.nextInt();

           //  Operation to turn the time to minutes
           int earlyTimeHours1 = earlyTime1 / 100;
           int earlyTimeMinutes1 = earlyTime1 % 100;
           int convertHours1 = earlyTimeHours1 * 60;
           int earlyTotalMinutes1 = convertHours1 + earlyTimeMinutes1;

           //  Operation to turn the time to minutes
           int earlyTimeHours2 = earlyTime2 / 100;
           int earlyTimeMinutes2 = earlyTime2 % 100;
           int convertHours2 = earlyTimeHours2 * 60;
           int earlyTotalMinutes2 = convertHours2 + earlyTimeMinutes2;

           //  Operation to turn the time to minutes
           int lateTimeHours1 = lateTime1 / 100;
           int lateTimeMinutes1 = lateTime1 % 100;
           int convertHours3 = lateTimeHours1 * 60;
           int lateTotalMinutes1 = convertHours3 + lateTimeMinutes1;

           //  Operation to turn the time to minutes
           int lateTimeHours2 = lateTime2 / 100;
           int lateTimeMinutes2 = lateTime2 % 100;
           int convertHours4 = lateTimeHours2 * 60;
           int lateTotalMinutes2 = convertHours4 + lateTimeMinutes2;

            //  Defining the variables for intervals
            int earlyInterval;
            int lateInterval;

            if (earlyTime1 < earlyTime2 || lateTime1 < lateTime2) {
                earlyInterval = earlyTotalMinutes2 - earlyTotalMinutes1;
                lateInterval = lateTotalMinutes2 - lateTotalMinutes1;
            } else {
                earlyInterval = earlyTotalMinutes1 - earlyTotalMinutes2;
                lateInterval = lateTotalMinutes1 - lateTotalMinutes2;
            }

            //  Displays a message to show the intervals
           System.out.println("");
           System.out.println("The earlier interval is " + earlyInterval
                   + " minutes long");
           System.out.println("The later interval is " + lateInterval
                   + " minutes long");

        /*  If statements determining the which
        interval is longer, and if they overlap
         */
           if (earlyInterval > lateInterval) {
               System.out.println("The earlier interval is longer");
               System.out.println("These intervals overlap");
           } else if (lateInterval > earlyInterval){
               System.out.println("The later interval is longer");
               System.out.println("These intervals do not overlap");
           } else {
               System.out.println("The intervals are equally long");
               System.out.println("These intervals do not overlap");
           }

           //  Displays a space after the result
            System.out.println("");
       }

    }
}
