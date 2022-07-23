package Labs.Lab4;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Random;

public class MyArray {

    int[] array = new int[10];
    Random rando = new Random();


    public int[] arrayfiller() {
        for (int i = 0; i < array.length; i++) {
            array[i] = rando.nextInt(10);
        }
        return array;
    }

    public void arrayReader() {
        String list = "";
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    
    public void reverseArrayReader(){
        for (int i = array.length; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }

    public int findTheBiggestValue() {
        int biggestValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > biggestValue) {
                biggestValue = array[i];
            }
        }
        return biggestValue;
    }

    public String findUserValue(int userInput) {
        int num = 0;
        int index =0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == userInput) {
                num = array[i];
                index = i;
                i = 10;
            } else {
                num = 0;
            }
        }
        return "Your value "+ num + " is in index " + index;
    }

    public int findArrayMean() {
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        return total/array.length;
    }
    public int findTheSecondLargest(){
        int temp = 0;
        for(int i = 0; i<array.length; i++ ){
            for(int j = i+1; j<array.length; j++){
                if(array[i]>array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        if (array[array.length-2] == 9)
            return array[array.length-3];
        else
            return array[array.length-2];
    }

    public void printHistogram(int[] array) {
        for (int i = 0; i < array.length; i++) {
            String label = i + " : ";
            System.out.println(label + convertToStars(array[i]));
        }
    }


    private String convertToStars(int num) {
        StringBuilder builder = new StringBuilder();
        for (int j = 0; j < num; j++) {
            builder.append('*');
        }
        return builder.toString();
    }


}