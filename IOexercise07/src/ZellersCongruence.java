import javax.swing.text.SimpleAttributeSet;
import java.util.ArrayList;
import java.util.Scanner;

public class ZellersCongruence {

    public static void main(String[] args){

        Scanner inputDate = new Scanner(System.in);
        System.out.println("\nWith Zeller's Congruence, an algorithm developed by Christian Zeller,\nwe will calculate the day of the week. Please enter a date!");
        System.out.println("\nFirst, the DAY (1-31):");
        // q is the day of the month
        int q = inputDate.nextInt();
        System.out.println("Then the MONTH (1-12):");
        // m is the month (1-12)
        int m = inputDate.nextInt();
        System.out.println("At last, the YEAR (0-9999):");
        int year = inputDate.nextInt();
        // out of the year, we will get:
        // j as the century: year/100
        // k as the year of the century: year%100
        int j = (int) (year/100.0);
        int k = year%100;
        int h = (q + ((int)((13*(m+1))/5.0) + k + (int)(k/4.0) + (int)(j/4.0) + (5*j)))%7;
        // d is the day of the week
        int d = ((h+5)%7)+1;

        // System.out.println("The day of the week is: " + d);

        ArrayList<String> days = new ArrayList<>();
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");

        System.out.println("\nThe day of the week is: " + days.get(d-1).toUpperCase());

    }
}
