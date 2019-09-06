//  Sukhamrit Singh
//  MergeTest
/*
This program prompts the user for the
lengths and contents of two sorted lists.
Then, it merges them and puts the numbers
in order.
 */

//  Imports the scanner library
import java.util.Scanner;

public class MergeTest {
    public static void main(String[] args) {

        //  To keep getting user input
        while (true) {

            //  Calling method to get list 1 and 2
            int[] list1 = MergeTest.getList(1);
            int[] list2 = MergeTest.getList(2);

            //  Call method to print list 1 and 2
            MergeTest.printList(1, list1);
            MergeTest.printList(2, list2);

            //  Displays an empty line
            System.out.println("");

            //  Variable to define the merged arrays
            int[] list3 = merge(list1, list2);

            //  For loop to print the merged arrays in order
            MergeTest.printList(3, list3);

            //  Displays two empty lines
            System.out.println("");
            System.out.println("");

        }
    }

    private static int[] getList(int listId) {

        //  Creates a scanner object for input
        Scanner input = new Scanner(System.in);

        //  Displays the message to enter size of list
        System.out.printf("Enter size of list %d: ", listId);

        //  Inputting the size of the list
        int numberInputed1 = input.nextInt();

        //  Defines an array "list"
        int[] list = new int[numberInputed1];

        //  Displays text to enter numbers in list
        System.out.printf("Enter items in list %d: ", listId);

        //  Keep getting input for how much size of list is
        for (int i = 0; i < numberInputed1; i++) {
            list[i] = input.nextInt();
        }

        //  Returns variable list
        return list;
    }

    //  Method to print the lists
    private static void printList(int listId, int[] list) {

        //  Displays an empty line
        System.out.println("");

        //  Displays what list one is to the user
        System.out.printf("List %d is ", listId);

        //  For loop to display the lists
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
            System.out.print("");
        }
    }

    //  Created a new method to merge the arrays together in order
    public static int[] merge(int[] list1, int[] list2) {

        //  Created a new array that merges the two other arrays
        int[]mergedArray = new int[list1.length + list2.length];

        //  Variables that defines the current numbers
        int currentList1 = 0;
        int currentList2 = 0;
        int count = 0;


        //  While loop to check the order of numbers
        while (count < mergedArray.length) {

            //  If statement to check and put numbers in order
            if (currentList1 == list1.length) {

                /*
                While loop to check if current number for
                second array is greater than array length
                 */
                while (currentList2 < list2.length) {
                    mergedArray[count++] = list2[currentList2++];
                }

                //  Breaks the while loop
                break;

            } else if (currentList2 == list2.length) {

                /*
                While loop to check if current number for
                first array is greater than array length
                 */
                while (currentList1 < list1.length) {
                    mergedArray[count++] = list1[currentList1++];
                }

                //  Breaks the while loop
                break;
            }

            /*
              If statement to keep the current number in
              both lists to keep moving to the next numbers
              if true
             */
            if (list1[currentList1] >= list2[currentList2]) {
                mergedArray[count++] = list2[currentList2++];
            } else {
                mergedArray[count++] = list1[currentList1++];
            }


        }

        //  Returns array mergedArray
        return mergedArray;
    }

}
