// Write a program that is dependant on a String s from command-line arguments args[0],
// then prompts the user to provide an int a and prints the following:
// My name is ”s” and I own [a] cats!

import java.util.Scanner;

public class NameArgsCats {

    public static void main(String[] args){
        String s = args[0];
        Scanner numberOfCats = new Scanner(System.in);
        System.out.println("\nHow many cats do you have?");
        int a = numberOfCats.nextInt();
        System.out.println("My name is " + s + " and I own " + a + " cats!");
    }
}
