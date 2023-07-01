import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double width = 0.0;
        double length = 0.0;
        double area = 0.0;
        double perimeter = 0.0;
        double diagonal = 0.0;
        String trash = "";
        boolean done = false;

        do {
            System.out.println("What is the width?");
            if (in.hasNextDouble()) {
                width = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println(trash + " is not a valid width");
            }
        }
        while (!done);
        do {
            System.out.println("What is the length?");
            if (in.hasNextDouble()) {
                length = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println(trash + " is not a valid length");
                done = false;
            }
        }
        while (!done);
        area = length * width;
        perimeter = (2*width) + (2*length);
        diagonal =  Math.sqrt(width*width+length*length);
        System.out.println("The Area is: " + area);
        System.out.println("The Perimeter is: " + perimeter);
        System.out.println("The Diagonal is: " + diagonal);
    }
}