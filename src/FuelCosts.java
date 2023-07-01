import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args)
    {
        Scanner in =new Scanner(System.in);
        double tankGal = 0.0;
        double fuelMPG = 0.0;
        double fuelPrice = 0.0;
        double cost = 0.0;
        double distance = 0.0;
        String trash ="";
        boolean done=false;

        do
        {
            System.out.println("How much gas is in the tank?");
            if(in.hasNextDouble())
            {
                tankGal = in.nextDouble();
                in.nextLine();
                done=true;
            }
            else
            {
                trash=in.nextLine();
                System.out.println(trash + " Is NOT a valid input for the gas in your tank");
            }
        }
        while(!done);
        do
        {
            System.out.println("What is your vehicles fuel efficiency in MPG?");
            if(in.hasNextDouble())
            {
                fuelMPG = in.nextDouble();
                in.nextLine();
                done=true;
            }
            else
            {
                trash=in.nextLine();
                System.out.println(trash + " Is NOT a valid input for your MPG");
                done=false;
            }

        }
        while(!done);
        do
        {
            System.out.println("What is the Price per gallon of gas?");
            if(in.hasNextDouble())
            {
                fuelPrice=in.nextDouble();
                in.nextLine();
                done=true;
            }
            else
            {
                trash=in.nextLine();
                System.out.println(trash + " Is NOT a valid input for the price of gas");
                done=false;
            }
        }
        while(!done);
        cost = (100 /fuelMPG) * fuelPrice;
        distance = fuelMPG * tankGal;
        System.out.println("To go 100 miles it will costs you: " + cost);
        System.out.println("The maximum distance you can go is: " + distance);



    }
}