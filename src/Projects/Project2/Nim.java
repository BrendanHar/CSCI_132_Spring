package Projects.Project2;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class Nim {

    Random rand = new Random();
    int marbles = rand.nextInt(90) + 11;

    public Nim(){

    }
    public int getMarbles(){
        return marbles;
    }

    public int updateMarbles (int input){
        marbles -= input;
        return marbles;
    }


    public static void main(String args[]){
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        Nim test = new Nim();
        int count = test.getMarbles();
        int computerType = rand.nextInt(2);
        boolean turn = rand.nextBoolean();


        System.out.println("The starting amount of marbles will be: " + count);
        System.out.println("The human will go first");
        if (computerType == 1){
            System.out.println("This computer is really smart!");
        }
        if (computerType == 0){
            System.out.println("This computer is kind of dumb!");
        }


        while (count > 0){
            if (turn == true) {
                System.out.println("How many marbles do you want to take (has to be less than or equal to " + count/2 + ").");
                int sub = input.nextInt();
                if (sub <= count/2){
                    count -= sub;
                    System.out.println("The number of marbles left is " + count);
                    System.out.println("");
                    turn = false;
                }
                else{
                    System.out.println("You can't take that many marbles. Try again.");
                    turn = true;
                }
            }
            if (turn == false) {
                System.out.println("Computer's Turn");
                if (computerType == 1) {
                    count = smartComputer(count);
                    System.out.println("Number of marbles left: " + count);
                    System.out.println("");
                } else {
                    if (computerType == 0) {
                        count -= rand.nextInt(count / 2);
                        System.out.println("The number of marbles left is " + count);
                        System.out.println("");
                    }
                }
                turn = true;
            }
        }
        if (count <=1){
            if (turn = false){
                System.out.println("WINNER WINNER CHICKEN DINNER!");
            }
            else{
                System.out.println("LAAAAME.... You lost to the computer.");
            }
        }
    }
            public static int smartComputer(int left){
            int power = 2;
            while (power < left)
            {
                power *= 2;
            }
            power /= 2;
            left = power-1;
            return left;
        }


}
