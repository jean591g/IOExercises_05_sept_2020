import java.util.Scanner;

public class UserNumber01 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Please write a number:");
        double userNumber = input.nextDouble();
        System.out.println("Half of the number you provided is: " + (userNumber/2));
        System.out.println("Thank you! Have a good day.");
    }
}
