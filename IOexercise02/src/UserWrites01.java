// We import the Scanner class from Java utilities library
import java.util.Scanner;
// We create a public class named UserWrites01
public class UserWrites01 {
    // We create a public static method named main
    public static void main(String[] args){
        // We initialize / instantiate the Scanner so we can use it with the "new" keyword and tell it to watch for input
        Scanner input = new Scanner(System.in);
        // We tell the user to provide input in the form of text
        System.out.println("Please write any text:");
        // We create a String named userInput and assign it the value of the user's text that was recorded by the Scanner
        String userInput = input.nextLine();
        // We print again the user's text as a confirmation
        System.out.println("You wrote:" + "\n" + userInput);
    }
}
