package Labs.Lab1;

import java.util.Random;
import java.util.Scanner;

public class Lab1 {


    public static void main(String[]args){
        String[] stringArray = new String[] {"H", "E", "L", "L", "O", " ", "W", "O", "R", "L", "D", };
        int[] myArray = new int[10];
        Random rand = new Random();

        for (int i =0; i < 10; i++){
            myArray[i] = rand.nextInt(20);
//            System.out.println(myArray[i]);
        }
        stepOne(myArray);
        System.out.println();
        stepTwo(myArray);
        System.out.println();
        System.out.print("The largest element in the array is ");
        System.out.println(printLargest(myArray));
        System.out.println();
        System.out.print("The average of the array is ");
        System.out.println(arrayaverage(myArray));
        System.out.println();
        printHistogram();
        System.out.println();
        frequencyCounter(myArray);
        System.out.println();
        findElement(myArray);
        System.out.println();


    }

    public static void stepOne(int[] arrayInput){
        for (int i = 0; i < 10; i++){
            System.out.println(arrayInput[i]);
        }
    }

    public static void stepTwo(int[] arrayInput){
        for (int i = 9; i > -1; i--){
            System.out.println(arrayInput[i]);
        }
    }

    public static int printLargest(int[] arrayInput){
        int temp = 0;

        for (int i = 0; i < 10; i++){
            if (arrayInput[i] > temp){
                temp = arrayInput[i];
            }
        }
        return temp;
    }

    public static int arrayaverage(int[] arrayInput){
        int sum = 0;
        int average;

        for (int i = 0; i < 10; i++){
            sum += arrayInput[i];
        }
        average = sum/arrayInput.length;

        return average;
    }

    public static void findElement(int[] arrayInput){
        int element;
        int count =0;
        Scanner input = new Scanner(System.in);
        System.out.print("What element would you like to search for? ");
        element = input.nextInt();
        for (int i = 0; i < 10; i++){
            if (element == arrayInput[i]){
                count ++;
                System.out.println("There is a " + element + " at index " + i);
            }
        }
        if (count == 0){
            System.out.println("There is no element with that value in the array.");
        }
    }

    public static void printHistogram(){
        for (int i = 0; i < 7; i++){
            for (int j = 7; j > i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void frequencyCounter(int[] arrayInput){
        int count = 0;


        for (int i = 0; i < 10; i++){
            if (arrayInput[i] == 0){
                count ++;
            }
        }
        if (count > 0) {
            System.out.println("The number 0 is in the array ");
            System.out.println(count + " times");
        }
        count = 0;

        for (int i = 0; i < 10; i++){
            if (arrayInput[i] == 1){
                count ++;
            }
        }
        if (count > 0) {
            System.out.println("The number 1 is in the array ");
            System.out.println(count + " times");
        }
        count = 0;

        for (int i = 0; i < 10; i++){
            if (arrayInput[i] == 2){
                count ++;
            }
        }
        if (count > 0) {
            System.out.println("The number 2 is in the array ");
            System.out.println(count + " times");
        }
        count = 0;

        for (int i = 0; i < 10; i++){
            if (arrayInput[i] == 3){
                count ++;
            }
        }
        if (count > 0) {
            System.out.println("The number 3 is in the array ");
            System.out.println(count + " times");
        }
        count = 0;

        for (int i = 0; i < 10; i++){
            if (arrayInput[i] == 4){
                count ++;
            }
        }
        if (count > 0) {
            System.out.println("The number 4 is in the array ");
            System.out.println(count + " times");
        }
        count = 0;

        for (int i = 0; i < 10; i++){
            if (arrayInput[i] == 5){
                count ++;
            }
        }
        if (count > 0) {
            System.out.println("The number 5 is in the array ");
            System.out.println(count + " times");
        }
        count = 0;

        for (int i = 0; i < 10; i++){
            if (arrayInput[i] == 6){
                count ++;
            }
        }
        if (count > 0) {
            System.out.println("The number 6 is in the array ");
            System.out.println(count + " times");
        }
        count = 0;

        for (int i = 0; i < 10; i++){
            if (arrayInput[i] == 7){
                count ++;
            }
        }
        if (count > 0) {
            System.out.println("The number 7 is in the array ");
            System.out.println(count + " times");
        }
        count = 0;

        for (int i = 0; i < 10; i++){
            if (arrayInput[i] == 8){
                count ++;
            }
        }
        if (count > 0) {
            System.out.println("The number 8 is in the array ");
            System.out.println(count + " times");
        }
        count = 0;

        for (int i = 0; i < 10; i++){
            if (arrayInput[i] == 9){
                count ++;
            }
        }
        if (count > 0) {
            System.out.println("The number 9 is in the array ");
            System.out.println(count + " times");
        }
        count = 0;

        for (int i = 0; i < 10; i++){
            if (arrayInput[i] == 10){
                count ++;
            }
        }
        if (count > 0) {
            System.out.println("The number 10 is in the array ");
            System.out.println(count + " times");
        }
        count = 0;

        for (int i = 0; i < 10; i++){
            if (arrayInput[i] == 11){
                count ++;
            }
        }
        if (count > 0) {
            System.out.println("The number 11 is in the array ");
            System.out.println(count + " times");
        }
        count = 0;

        for (int i = 0; i < 10; i++){
            if (arrayInput[i] == 12){
                count ++;
            }
        }
        if (count > 0) {
            System.out.println("The number 12 is in the array ");
            System.out.println(count + " times");
        }
        count = 0;

        for (int i = 0; i < 10; i++){
            if (arrayInput[i] == 13){
                count ++;
            }
        }
        if (count > 0) {
            System.out.println("The number 13 is in the array ");
            System.out.println(count + " times");
        }
        count = 0;

        for (int i = 0; i < 10; i++){
            if (arrayInput[i] == 14){
                count ++;
            }
        }
        if (count > 0) {
            System.out.println("The number 14 is in the array ");
            System.out.println(count + " times");
        }
        count = 0;

        for (int i = 0; i < 10; i++){
            if (arrayInput[i] == 15){
                count ++;
            }
        }
        if (count > 0) {
            System.out.println("The number 15 is in the array ");
            System.out.println(count + " times");
        }
        count = 0;

        for (int i = 0; i < 10; i++){
            if (arrayInput[i] == 16){
                count ++;
            }
        }
        if (count > 0) {
            System.out.println("The number 16 is in the array ");
            System.out.println(count + " times");
        }
        count = 0;

        for (int i = 0; i < 10; i++){
            if (arrayInput[i] == 17){
                count ++;
            }
        }
        if (count > 0) {
            System.out.println("The number 17 is in the array ");
            System.out.println(count + " times");
        }
        count = 0;

        for (int i = 0; i < 10; i++){
            if (arrayInput[i] == 18){
                count ++;
            }
        }
        if (count > 0) {
            System.out.println("The number 18 is in the array ");
            System.out.println(count + " times");
        }
        count = 0;

        for (int i = 0; i < 10; i++){
            if (arrayInput[i] == 19){
                count ++;
            }
        }
        if (count > 0) {
            System.out.println("The number 19 is in the array ");
            System.out.println(count + " times");
        }
        count = 0;

        for (int i = 0; i < 10; i++){
            if (arrayInput[i] == 20){
                count ++;
            }
        }
        if (count > 0) {
            System.out.println("The number 20 is in the array ");
            System.out.println(count + " times");
        }
        count = 0;

    }

}
