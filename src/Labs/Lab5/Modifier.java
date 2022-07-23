package Labs.Lab5;

public class Modifier {

    public Modifier(String sentence){
        System.out.println(sentence);
    }

//    public static int countCharacters (String character, char searchedChar, int index) {
//            if (index >= character.length()) {
//                return 0;
//            }
//            int count = character.charAt(index) == searchedChar ? 1 : 0;
//            return count + countCharacters(character, searchedChar, index + 1);
//    }

    public int countCharacters(String sentence, char input){
        int count= 0;
        for (int i = 0; i < sentence.length(); i++){
            if (sentence.charAt(i) == input){
                count++ ;
            }
        }
        return count;
    }

    public int countSpaces(String sentence){
        int count = 0;
        char space = ' ';
        for (int i = 0; i < sentence.length(); i++){
            if (sentence.charAt(i) == space){
                count++;
            }
        }
        return count;
    }

//    public int countWords(String sentence){
//        int count = 0;
//        for (int i = 0; i < sentence.length() - 1; i++){
//            if (Character.isLetter(sentence.charAt(i))){
//                count++;
//                for(i = 0; i <= sentence.length() - 1 ; i++){
//                    if (sentence.charAt(i) == ' ');
//                    count++;
//                }
//            }
//        }
//        return count;
//    }

    public static int countWords(String s){

        int wordCount = 0;

        boolean word = false;
        int endOfLine = s.length() - 1;

        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i)) && i != endOfLine) {
                word = true;
                // if char isn't a letter and there have been letters before,
                // counter goes up.
            } else if (!Character.isLetter(s.charAt(i)) && word) {
                wordCount++;
                word = false;
                // last word of String; if it doesn't end with a non letter, it
                // wouldn't count without this.
            } else if (Character.isLetter(s.charAt(i)) && i == endOfLine) {
                wordCount++;
            }
        }
        return wordCount;
    }



}
