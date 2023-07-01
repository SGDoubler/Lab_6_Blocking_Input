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
        String trash = "";

        System.out.println("What is the measurement in meters?");
        if (in.hasNextDouble())
        {
            meters = in.nextDouble();
            in.nextLine();
        }
        else {
            trash = in.nextLine();
            System.out.println(trash + "Is not a valid input GOODBYE!");
        }
        miles = meters * 0.000621371;
        feet = meters * 3.28084;
        inches = meters * 39.37;
        System.out.println(meters + " is: " + miles + " miles");
        System.out.println(meters + " is: " + feet + " meters");
        System.out.println(meters + " is: " + inches + " inches");
    }
}