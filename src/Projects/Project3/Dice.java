package Projects.Project3;
import java.util.Random;
public class Dice {

//    Random rand = new Random();
//    int [] die = new int[5];
//    int sides = 6;
//    private int dieRollCount;
//    int fourOfAKindCount = 0;
//    int roles = 5000;
//    int yahtzeeCount = 0, fullHouseCount = 0, largeSraightCount = 0, threeOfAKindCount = 0, loserCount =0;
//
//
//    public void Dice(){
//        for(int i = 0; i < die.length; i++){
//            die[i] = rand.nextInt(sides)+1;
//        }
//    }
//
//    public void roll (){
//        for (int i = 0; i< die.length; i++){
//            die[i] = rand.nextInt(sides)+1;
//        }
//    }
//
//    public String toString(){
//        return ("("+ die[0] + ", " + die[1] +", " + die[2] +", " + die[3] +", " + die[4] + ")");
//    }
//
//    public int[] score(){
//        int [] count = new int[die[1]+die[2]+die[3]+die[4]+die[5]];
//        return count;
//    }
//
//    public boolean countThreeOfAKind(){
//        int count = 0;
//        boolean threeofakindcheck = false;
//        for (int i = 0; i< die.length; i++){
//            int sum = 0;
//            for(int j = 0; j < die.length; j ++){
//                if (die[j] == die[i]){
//                    sum++;
//                }
//                if (sum == 3){
//                    count ++;
//                    threeofakindcheck = true;
//            }
//        }
//        }
//        threeOfAKindCount += count;
//        return threeofakindcheck;
//    }
//
//    public void countFourOfAKind(int count){
//        int sum = 0;
//        for (int i = 0; i< die.length; i++){
//            for (int j = 0; j< die.length; j++){
//                if (die[j] == die[i]){
//                    sum++;
//                    if (sum == 4){
//                        count ++;
//                }
//            }
//        }
//        }
//        fourOfAKindCount += count;
//    }

//    public int CalculateThreeOfAKind( )
//    {
//        int Sum = 0;
//
//        boolean ThreeOfAKind = false;
//
//        for( int i = 1; i <= 6; i++ )
//        {
//            int Count = 0;
//            for( int j = 0; j < 5; j++ )
//            {
//                if( die[j].RollNumber == i )
//                    Count++;
//
//                if( Count > 2 )
//                    ThreeOfAKind = true;
//            }
//        }
//
//        if( ThreeOfAKind )
//        {
//            for( int k = 0; k < 5; k++ )
//            {
//                Sum += die[k].RollNumber;
//            }
//        }
//
//        return Sum;
//    }



}
