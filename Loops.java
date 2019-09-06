import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        int count = 0;

        int randomNumber = (int) (Math.random() *101);
        int guess;

        boolean isCorrect = false;

        while (! isCorrect) {
            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();

            if (choice < randomNumber) {
                System.out.println("Too Low");
            } else if (choice > randomNumber) {
                System.out.println("Too high");

            } else {
                System.out.println("Congrats");
                isCorrect = true;
            }

        }
    }





}
