package Labs.RecursionLab;

public class QuestionOne {

    public static boolean palindromeTest(String input){
        if (input == null || input.length() == 0){
            return false;
        }
        for (int i = 0, j = input.length() -1; i< j; i++, j--){
            if (input.charAt(i) != input.charAt(j)){
                return false;
            }
        }
        return true;
    }


    public static void main (String [] args){
        String example = "XYBYBYX";
        if (palindromeTest(example)){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a Palindrome");
        }
    }
}
