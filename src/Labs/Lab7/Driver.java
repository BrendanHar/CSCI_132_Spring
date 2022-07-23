package Labs.Lab7;

public class Driver {

    public static void main (String[] args){
        String test1 = "Hello";
        String test2 = "brurb";
        String test3 = "radar";
        String test4 = "codebreaker";
        String test5 = "miloolim";

        QuestionOne example1 = new QuestionOne();
        QuestionTwo example2 = new QuestionTwo();
        example1.printer(test1);
        example1.printer(test2);
        example1.printer(test3);
        example1.printer(test4);
        example1.printer(test5);

        example2.printer(48, 14);

    }
}
