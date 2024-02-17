import java.util.Scanner;

public class MetricConverter
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double meters = 0.0;
        double miles = 0.0;
        double feet = 0.0;
        double inches = 0.0;

        do {
            System.out.print("Enter a measurement in meters: ");
            while (!in.hasNextDouble()) {
                System.out.println("Error: Please enter a valid number.");
                System.out.print("Enter a measurement in meters: ");
                in.nextLine(); // consume the invalid input
            }
            meters = in.nextDouble();
            if (meters < 0) {
                System.out.println("Error: Measurement cannot be negative.");
            }
        } while (meters < 0);

         miles = meters * 0.000621371;
         feet = meters * 3.28084;
         inches = meters * 39.3701;

        System.out.println(meters + " meters is equal to:");
        System.out.println(miles + " miles");
        System.out.println(feet + " feet");
        System.out.println(inches + " inches");
    }
}
