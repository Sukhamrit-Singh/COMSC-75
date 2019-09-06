import java.util.Scanner;

public class Forfun {
    public static void main(String[] args) {

        while (true) {
            Scanner input = new Scanner(System.in);

            int oneDeci = input.nextInt();

            System.out.print(oneDeci + ", ");

            while (oneDeci < 12) {

                if (oneDeci < 12) {
                    oneDeci += 1;

                    System.out.print(oneDeci + ", ");
                } else if (oneDeci == 12)
                    break;
            }
            System.out.println("");
            System.out.println("");
        }
    }

}
