import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Sortering {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("\nPlease write 5 words separated by spaces:");
        String wordslist = input.nextLine();

        String[] arrOfStr = wordslist.split(" ");

        Arrays.sort(arrOfStr, Collections.reverseOrder(String.CASE_INSENSITIVE_ORDER));

        System.out.println("\nThe list of words in reversed alphabetic order: ");

        //for each loop to print array elements, one per line
        for (String s : arrOfStr){
        System.out.println(s);
        }
        input.close();
    }
}
