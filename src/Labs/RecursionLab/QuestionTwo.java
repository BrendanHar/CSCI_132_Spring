package Labs.RecursionLab;

public class QuestionTwo {



    public static void main (String [] args){
        int num1 = 48, num2= 14;
        int bruh = findGCD(num1, num2);
        System.out.println(num1 + " " + num2 + " " + bruh);
    }



    public static int findGCD(int a, int b){
        if (a == 0 || b == 0) return a+b;
        return findGCD(b, a%b);
    }
}