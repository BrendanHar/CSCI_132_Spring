package Projects.Project3;
import java.util.Random;

public class Yahtzee {

    //fields that include an array for the die as well as all of the counters for the different types of roles
    int[] die = new int[5];
    int roles;
    int yahtzeeCount = 0, fullHouseCount = 0, largeStraightCount = 0, fourOfAKindCount = 0, threeOfAKindCount = 0, loserCount = 0;
    double yahtzeePercent, fullHousePercent, largeStraightPercent, fourOfAKindPercent, threeOfAKindPercent, loserPercent;

    public Yahtzee(int count) {
        this.roles = count;
    }

    // assigns random values to each of the die
    public int[] diceRoll() {
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            this.die[i] = rand.nextInt(6) + 1;
        }
        return die;
    }

    //method to sort the die in ascending order
    private static void sortDie(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                int tmp = 0;
                if (arr[i] > arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }

    // method to count the different types of roles
    public void kindCounter() {
        int count = 0;
        int temp =0;
        //for loop that goes through and checks how many of the dice match each other and stores the values
        for (int i = 0; i < die.length; i++) {
            for (int j = i + 1 ; j < 5; j++) {
                if (die[i] == die[j]) {
                    count++;
                    temp = die[i];
                }
            }
        }
        //if else statements that increase the counts of the different types of roles depending on what dice values are in the role
        //uncomment the print statements as well as the print loop in the printer method below to validate that the program is working correctly
        if (count == 2){
        }
        if (count == 3) {
            threeOfAKindCount++;
//            System.out.print(" <- three of a kind");
        }
        else if (count == 4){
            fullHouseCount++;
//            System.out.print(" <- full house");
        }
        else if (die[0] == temp && die[1] == temp && die[2] == temp && die[3] == temp && die[4] == temp){
            yahtzeeCount++;
//            System.out.print(" <- YAHTZEE!!");
        }

        else if (die[0] == temp && die[1] == temp && die[2] == temp && die[3] == temp && die[4] != temp){
            fourOfAKindCount++;
//            System.out.print(" <- four of a kind 1");
        }
        else if (die[0] != temp && die[1] == temp && die[2] == temp && die[3] == temp && die[4] == temp){
            fourOfAKindCount++;
//            System.out.print(" <- four of a kind 2");
        }
        else if (die[0] == 1 && die[1] == 2 && die[2] == 3 && die[3] == 4 && die[4] == 5){
            largeStraightCount++;
//            System.out.print(" <- large straight");
        }
        else if (die[0] == 2 && die[1] == 3 && die[2] == 4 && die[3] == 5 && die[4] == 6){
            largeStraightCount++;
//            System.out.print(" <- large straight");
        }
        else {
            loserCount++;
        }
    }

    // method to find the percentage of different roles
    public void percentFinder() {
        yahtzeePercent = (double)(yahtzeeCount) / (double)(roles) * 100;
        fullHousePercent = (double)(fullHouseCount) / (double)(roles) * 100;
        largeStraightPercent = (double)(largeStraightCount) / (double)(roles) * 100;
        fourOfAKindPercent = (double)(fourOfAKindCount) / (double) (roles)* 100;
        threeOfAKindPercent = (double)(threeOfAKindCount) / (double) (roles)* 100;
        loserPercent = (double) (loserCount)/ (double) (roles) * 100;
    }
    // method to print the unsorted die (mostly for my use to make sure the sorter was working correctly
    public void printUnsortedDie(){
        for (int i = 0; i < die.length; i++){
            System.out.print(die[i]);
        }
    }

    // method to print out all relevant information 
    public void Printer() {
        for (int j = 0; j < roles; j++) {
            diceRoll();
            sortDie(die);
            //uncomment this section to verify that kindCounter() is working correctly as well as code commented out in method
//            for (int i = 0; i < 5; i++) {
//                System.out.print(this.die[i]);
//            }
            kindCounter();
//            System.out.println();

        }
        percentFinder();

        System.out.println("Number of Rolls: " + roles);
        System.out.println("---------------------");
        System.out.println("Number of Yahtzees: " + yahtzeeCount);
        System.out.println("Yahtzee Percent: " + String.format("%.2f", yahtzeePercent) + "%");
        System.out.println("Number of Full Houses: " + fullHouseCount);
        System.out.println("Full House Percent: " + String.format("%.2f", fullHousePercent) + "%");
        System.out.println("Number of Large Straights: " + largeStraightCount);
        System.out.println("Large Straight Percent: " + String.format("%.2f", largeStraightPercent) + "%");
        System.out.println("Number of Four of a Kind: " +fourOfAKindCount);
        System.out.println("Four of a Kind Percent: " + String.format("%.2f", fourOfAKindPercent) + "%");
        System.out.println("Number of Three of a Kind: " +threeOfAKindCount);
        System.out.println("Three of a Kind Percent: " + String.format("%.2f", threeOfAKindPercent) + "%");
        System.out.println("Number of Losers: " + loserCount);
        System.out.print("Losers Percent: " + String.format("%.2f", loserPercent) + "%");

    }
}














