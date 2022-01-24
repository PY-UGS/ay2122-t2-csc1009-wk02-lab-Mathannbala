import java.util.Scanner;

public class Question1 {
    //Define PI as a constant
    private static final double PI = 3.14159;

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        //area of circle
        System.out.print("Enter a number for radius : ");
        double radius = input.nextDouble();
        double area = radius * radius * PI;
        System.out.print("The area for the circle of radius " + radius + " is " + String.format("%.2f",area) );
        input.close();
    }
}

