import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double convertedF = 0.0;
        int c = 0;
        String trash = "";//Bad input
        boolean done=false;

        do {
            System.out.println("What temperature in Celsius do you want to convert?");
            if(in.hasNextInt())
            {
                c = in.nextInt();
                in.nextLine();//Buffer clear
                convertedF = (c * 9/5) + 32;
                System.out.println(c + " Converted to Farenheit is: "+ convertedF);
                if (c <= 0)
                {
                    System.out.println("This temperature is below the freezing point of water");
                }
                if (c >= 100)
                {
                    System.out.println("This temperature is above the boiling point of water");
                }
                done=true;
            }
            else
            {
                trash=in.nextLine();
                System.out.println("\nYou said the temperature is :"+trash);
                System.out.println("You must input a valid temperature");
            }

        }
        while(!done);
    }
}