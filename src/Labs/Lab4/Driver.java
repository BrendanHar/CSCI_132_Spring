package Labs.Lab4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Driver {


    public static void main(String args[]) {

        MyArray testArray = new MyArray();
        System.out.println(Arrays.toString(testArray.arrayfiller()));

        System.out.println("");
//        System.out.println(testArray.findUserValue());
        System.out.print("The Biggest Value is ");
        System.out.println(testArray.findTheBiggestValue());
        System.out.println(testArray.findArrayMean());
        System.out.println(testArray.findUserValue(3));
        System.out.print("The Second Biggest Value is ");
        System.out.println(testArray.findTheSecondLargest());
//        System.out.println(testArray.printHistogram(testArray.array););


        for (int i = 0; i < testArray.array.length; i++) {
            System.out.print(testArray.array[i] + " ,");
        }
        System.out.println("");




//        for (int i = testArray.array.length; i >= 0 ; i--){
//            System.out.print(testArray.array[i]);
//            System.out.print(" ,");
//        }

        int zero = 0;
        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        int five = 0;
        int six = 0;
        int seven = 0;
        int eight = 0;
        int nine = 0;


        for (int i = 0; i < testArray.array.length; i++) {
            int num;
            num = testArray.array[i];
            if (num == 0)
                zero++;
            if (num == 1)
                one++;
            if (num == 2)
                two++;
            if (num == 3)
                three++;
            if (num == 4)
                four++;
            if (num == 5)
                five++;
            if (num == 6)
                six++;
            if (num == 7)
                seven++;
            if (num == 8)
                eight++;
            if (num == 9)
                nine++;
        }

        System.out.println("Histogram" );
        System.out.println("0 occurred " + zero + " times");
        System.out.println("1 occurred " + one  + " times");
        System.out.println("2 occurred " + two + " times");
        System.out.println("3 occurred " + three + " times");
        System.out.println("4 occurred " + four + " times");
        System.out.println("5 occurred " + five + " times");
        System.out.println("6 occurred " + six + " times");
        System.out.println("7 occurred " + seven + " times");
        System.out.println("8 occurred " + eight + " times");
        System.out.println("9 occurred " + nine + " times");


    }
}