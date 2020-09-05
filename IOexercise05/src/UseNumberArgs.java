
public class UseNumberArgs {

        public static void main(String[] args){
            String textNumber = args[0];
            double value = Double.parseDouble(textNumber);
            System.out.println("\nArgs number: " + args[0] + " divided by 2 is: " + (value/2));
            System.out.println("Thank you! Have a good day.");
        }
    }
