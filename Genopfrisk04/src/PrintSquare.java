import java.util.Scanner;

public class PrintSquare {

    public static void main(String[] args){

        Scanner input1 = new Scanner(System.in);
        System.out.println("\nHow many lines should the length of the square be?");
        int squareLength = input1.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Which character would you like to be printed into the square?");
        String character = input2.nextLine();

        System.out.println();

        for (int i=1; i <= squareLength; i++){
            for (int j=1; j <= squareLength; j++){
                System.out.print(character + " ");
            }
            System.out.println();
        }
    }
}
