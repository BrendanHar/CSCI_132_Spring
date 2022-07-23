package Projects.Project3;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
public class Example {
    public static void main (String args []) {

        Scanner in = new Scanner (System.in);

        int[] counts = new int[1000];
        int [] counts2 = new int[1000];

        int userInput;
        String input;
        int counter = 0;


        System.out.println("Hello and welcome to the program");
        System.out.println("In this program two six sided dices will be rolled and one eleven sided dice will be rolled (1000 times each)");

        System.out.println("The dices will be rolled to determine the odds of how many times the roll 2 comes up on both dices and die");
        System.out.println("(Press any key to be prompted) with user Instructions");
        input = in.nextLine();

        System.out.println("To determine the amount of times snake eyes is rolled with two six sided dices press '1'");
        System.out.println("For the amount of times two is rolled on a eleven sided die press '2'");
        System.out.println("For both press '3', or to exit this program press '4' ");
        userInput = in.nextInt();
        in.nextLine();

        if (userInput == 1)
        {

            System.out.println("is " + counter);
        }

        else if (userInput == 2)
        {
            // enter code...(Not finished)
        }

        else if (userInput == 3)
        {
            // enter code...(Not finished)
        }

        else
        {
            // enter code... (Not finished)
        }
    }
    // pass array into method
    void myMethod (int[] counts, int[] counts2)
    {
        for (int i = 0; i < counts.length; i++)
        {

            counts [i] = (int)(Math.random ()*6+1)+ (int)(Math.random ()*6+1);
            counts2 [i] = (int)(Math.random ()*10+2);
        }
    } // pass array into method
    public static int Secendmethod (int [] counts, int counter)
    {
        Arrays.binarySearch(counts, 2);
        for(int i = 0; i <counts.length; i++)

            if (counts[i] == 2) {
                counter++;

            }
        return counter ;
    }
}


