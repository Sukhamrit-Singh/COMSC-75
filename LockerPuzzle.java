//  Sukhamrit Singh
//  LockerPuzzle
/*
This program finds the open lockers and displays
all open locker numbers separated by exactly one
space.  The program an array of 100 boolean elements,
each of which indicates whether a locker is open (true)
or closed (false). Initially, all lockers are closed.
 */

public class LockerPuzzle {
    public static void main(String[] args) {
        //  Constant that defines number of lockers
        final int NUM_OF_LOCKERS = 100;

        //  Creating an array to see number of open lockers
        boolean[] openLockers = new boolean[NUM_OF_LOCKERS];

        /*
          For loop to see each student closing and
          opening the lockers
         */
        for (int student = 1; student <= NUM_OF_LOCKERS; student++) {

            /*
            For loop that tells if locker is false,
            becomes true, and vice versa
             */
            for (int i = student - 1; i < NUM_OF_LOCKERS; i += student) {
                openLockers[i] = !openLockers[i];

            }
        }

        //  For loop to print which lockers are open
        for (int i = 0; i < NUM_OF_LOCKERS; i++) {
            if (openLockers[i]) {
                System.out.println(i + 1);
                System.out.println("");
            }
        }

    }


}
