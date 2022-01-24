import java.util.Scanner;

public class Question2 {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        //Prompt user to enter three numbers
        System.out.print("Enter Three Numbers: ");
        float[] num = new float[4];

        for( int i = 0; i < 3; i++)
        {
            num[i] = input.nextFloat();
            num[3] += num[i];
        }
        num[3] /= 3;
        System.out.print("The average of " + num[0] + " "  + num[1] + " " +  num[2] + " is " + num[3]);
        input.close();
    }
}
