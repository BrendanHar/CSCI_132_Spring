package Labs.Lab7;

public class QuestionOne {

//    String word;
//    int length;
//    int start = 0;
//
//    QuestionOne(String input){
//        this.word = input;
//        this.length = input.length();
//    }

    public static boolean palindromeCheck(String input, int startIndex, int endIndex){
        if(startIndex == endIndex){
            return true;
        }

        if (input.charAt(startIndex) != input.charAt(endIndex)){
            return false;
        }

        if (startIndex < endIndex + 1){
            return palindromeCheck(input, startIndex + 1, endIndex - 1);
        }
        return true;
    }

    public static void printer(String input){
        int start = 0;
        int end = input.length() - 1;
        if (palindromeCheck(input, start, end) == true){
            System.out.println("The string " + input + " is a palindrome.");
        }
        if (palindromeCheck(input, start, end) == false){
            System.out.println("The string " + input + " is not a palindrome.");
        }

    }

}
