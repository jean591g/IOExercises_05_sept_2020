import java.util.Scanner;

public class GrassCut {

    public static void main(String[] args) {

        double grassgrowthperday = 0.8; // 0,8 centimeter growth per day

        Scanner input = new Scanner(System.in);
        System.out.println("\nHow long is the grass now (cm)?");
        double grasslengthnow = input.nextDouble();

        System.out.println("How long should the maximum grass length be (cm)?");
        double maxgrasslength = input.nextDouble();

        double numberofdaysuntilnextcutDB = (maxgrasslength - grasslengthnow) * grassgrowthperday;
        int numberofdaysuntilnextcutINT = (int) ((maxgrasslength - grasslengthnow) * grassgrowthperday);
        int decimalsashours = (int)((numberofdaysuntilnextcutDB - numberofdaysuntilnextcutINT)*24);

        if (numberofdaysuntilnextcutDB <=1) {
            System.out.println("The grass should be cut today.");
        } else {
            System.out.println("The grass should be cut again in " + numberofdaysuntilnextcutINT + " day(s) and " + decimalsashours + " hour(s).");
        }
    }
}
