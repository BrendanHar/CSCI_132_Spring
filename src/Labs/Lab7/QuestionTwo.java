package Labs.Lab7;

public class QuestionTwo {


    public static int commonDivisorFinder(int input1, int input2){
        int divisor;
        int remainder;

        divisor = input1 / input2;
        remainder = input1 % input2;

        if (remainder == 0){
            return divisor;
        }
        if (remainder != 0){
            System.out.println(input2 + " " + remainder);
            return commonDivisorFinder(input2, remainder);
        }


        return commonDivisorFinder(remainder, input2);
    }

    public static void printer(int input1, int input2){
        System.out.println("The greatest common divisor of " + input1 + " and " + input2 + " is " + commonDivisorFinder(input1, input2));

    }
}
