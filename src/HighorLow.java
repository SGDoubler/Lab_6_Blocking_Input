import java.util.Random;
import java.util.Scanner;

public class HighorLow
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int randomNum = random.nextInt(10) + 1;
        int userNum = 0;
        String trash = "";
        do
        {
            System.out.println("Pick a number 1-10 ");
            if (in.hasNextInt())
            {
                userNum = in.nextInt();
                if (userNum < 1 || userNum > 10)
                {
                    System.out.println(userNum + " is not BETWEEN 1-10");
                }
            }
            else
            {
                trash = in.nextLine();
                System.out.println("That is not a valid Number");
            }


        }while (userNum < 1 || userNum > 10);
        if (userNum == randomNum)
        {
            System.out.println("The random number was: " + randomNum);
            System.out.println("You have guessed the number!");
        } else if (userNum < randomNum)
        {
            System.out.println("The random number was: " + randomNum);
            System.out.println("Too low, try again!");
        }
        else
        {
            System.out.println("The random number was: " + randomNum);
            System.out.println("Too high, try again!");
        }



    }
}