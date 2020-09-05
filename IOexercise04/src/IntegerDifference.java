import java.util.Scanner;

public class IntegerDifference {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("\nPlease provide an integer number (no decimals):");
        int n = input.nextInt();
        System.out.println("The difference between your integer number " + n + " and 21 is: " + (21-n));
    }
}
