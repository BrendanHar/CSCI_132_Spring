package Labs.Lab5;
import java.util.Arrays;
import java.util.Scanner;
public class Driver {



    public static void main(String [] args){


        boolean onOff = true;

        while (onOff == true) {
            Scanner input = new Scanner(System.in);
            Scanner flip = new Scanner(System.in);

            System.out.print("Input a sentence: ");
            String sentence = input.nextLine();
            Modifier test = new Modifier(sentence);
            String[] wordCount = sentence.split(" ");

            String spacelessString = sentence.replaceAll("\\s", "");
            System.out.println(spacelessString);


            System.out.println("What character would you like to count? ");
            char car = input.next().charAt(0);
            System.out.println("There are " + test.countCharacters(sentence, car) + " occurrence of that character.");

            System.out.println("There are " + test.countSpaces(sentence) + " spaces in the sentence.");
            System.out.println("There are " + wordCount.length + " words in the sentence.");

//            for (int i = 0; i < wordCount.length; i++) System.out.print(Arrays.toString(wordCount));



            System.out.println("Would you like to continue? (yes/ no) ");
            char systemSwitch = flip.next().charAt(0);
            if (systemSwitch == 'n'){
                break;
            }

        }

    }

}
