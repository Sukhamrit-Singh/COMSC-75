import java.util.Scanner;
public class ComputeCircumference {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        // final double PI = 3.14;

        double radius;
        double circumference;

        System.out.print("Enter radius here: ");

        radius = input.nextDouble();

        circumference = 2 * Math.PI * radius;

        System.out.printf ("The circumference for a circle of radius %.2f is: %.3f \n", radius, circumference);
    }
}
