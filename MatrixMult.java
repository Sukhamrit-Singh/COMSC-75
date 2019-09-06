//  Sukhamrit Singh
//  Matrix Mult
/*
This program will prompt the user for the
number of rows and columns for the first
matrix, then its contents. It will then prompt
the user for the number of rows and columns for
the second matrix, then its contents. It will call your
multiplyMatrix() function and print the resulting matrix.
If the matrices are not compatible, your program should
give an error message.
 */

//  Imports the scanner library
import java.util.Scanner;

public class MatrixMult {
    public static void main(String[] args) {

        //  Creating a loop to keep getting user input
        while (true) {

            //  Displays Matrix A title
            System.out.println("Matrix A");

            //  Calls method to let user enter all inputs
            double[][] matrixA = MatrixMult.getContent(1);

            //  Displays an empty line
            System.out.println("");

            //  Displays Matrix B title
            System.out.println("Matrix B");

            //  Calls method to let user enter all inputs
            double[][] matrixB = MatrixMult.getContent(2);

            //  Displays an empty line
            System.out.println("");

            //  If statement to check if input is valid or not
            if (matrixA.length * matrixA[0].length !=
                    matrixB.length * matrixB[0].length) {
                System.out.println("Invalid input");
            } else
                //  Displays Matrix C title
                System.out.println("Matrix C");

            //  Call method to display the final matrix
            multiplyMatrix(matrixA, matrixB);

            //  Displays an empty line
            System.out.println("");
        }
    }

    //  Method to get input for both matrices
    public static double[][] getContent(int listId) {

        // Creating a multi-dimensional array
        double contentsList[][];

        //  Created a scanner variable
        Scanner input = new Scanner(System.in);

        //  Displays some text
        System.out.print("Enter the number of rows: ");

        //  Created a scanner object
        int numOfRows = input.nextInt();

        //  Displays some text
        System.out.print("Enter the number of columns: ");

        //  Created a scanner object
        int numOfColumns = input.nextInt();

        //  Displays some text
        System.out.print("Enter contents by rows: ");

        //  Defined the multi-dimensional array
        contentsList = new double[numOfRows][numOfColumns];

        //  For loop to keep getting user input
        for (int i = 0; i < numOfRows; i++) {
            for (int j = 0; j < numOfColumns; j++) {
                int contents = input.nextInt();
                contentsList[i][j] = contents;
            }

        }
        //  Returns contentsList
        return contentsList;
    }

    //  Method to multiply the inputs and make a final matrix
    public static double[][]
        multiplyMatrix(double[][] a, double [][] b) {

        // Creating a multi-dimensional array
        double[][] finalMatrix;

        //  Defined the multi-dimensional array
        finalMatrix = new double[a.length][a.length];

        /*
          For loop to get the order and multiply the
          proper inputs together
         */
        for( int k = 0; k < b[0].length; ++k) {
            for (int i = 0; i < a.length; i++) {
                int total = 0;
               for (int j = 0; j < a[0].length; j++){
                double number1 = a[i][j];
                double number2 = b[j][k];
                total += number1 * number2;
               }

                //  Defined the multi-dimensional array
                finalMatrix[i][k] = total;
            }
        }

        //  For loop to print the final matrix values
        for (int i=0; i < finalMatrix.length; ++i) {
            for(int j=0; j < finalMatrix[0].length; ++j) {
                System.out.print(finalMatrix[i][j]);
                System.out.print("  ");
            }

            //  Displays an empty line
            System.out.println("");
        }

        //  Returns finalMatrix
        return finalMatrix;
    }
}
