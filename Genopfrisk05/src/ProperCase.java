// • Ord, som udelukkende er skrevet med store bogstaver, skal ikke ændres.
// • Ord på mere end 3 bogstaver skal skrives med småt, dog med stort begyndelsesbogstav.
// • Ord på max. 3 bogstaver skal skrives med småt.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProperCase {

    public static void main(String[] args) throws IOException {

        System.out.println("\nPlease write words in different type cases, separated by spaces:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // Actually use the Reader
        String sentence = br.readLine();

        String[] arrOfStr = sentence.split(" ");
        for (String word: arrOfStr) {
            // kortere og smart anden måde at tjekke på Uppercase via Rune, uden if i if betingelse:
            // if (sentence == sentence..toUpperCase(){
            //   continue;}
            if (isStringUpperCase(word) == false) {

                if (word.length() > 3) {
                    // Don't mistake String object with word Character object
                    String longWord = word.substring(0, 1).toUpperCase();
                    String nameCapitalized = longWord + word.substring(1);
                    word = nameCapitalized + " ";
                }
                if (word.length() <= 3) {
                    String shortWord = word.toLowerCase();
                    word = shortWord + " ";
                }
            }
            System.out.print(word);
        }
        System.out.println();
    }

    private static boolean isStringUpperCase (String word){

        //convert String to char array
        char[] charArray = word.toCharArray();

        for (int i = 0; i < charArray.length; i++) {

            //if the character is a letter
            if (Character.isLetter(charArray[i])) {

                //if any character is not in upper case, return false
                if (!Character.isUpperCase(charArray[i]))
                    return false;
            }
        }
        return true;
    }
}

