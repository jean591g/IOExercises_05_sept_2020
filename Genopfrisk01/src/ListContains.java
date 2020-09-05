import java.util.ArrayList;

public class ListContains {
    public static void main(String[] args){

        ArrayList<String> containString = new ArrayList<>();
        containString.add("Hello");
        containString.add("Goodbye");
        containString.add("Again");
        containString.add("Today");

        String word = "Tomorrow";

        doesArraylistContainString(containString, word);

    }


    public static boolean doesArraylistContainString(ArrayList<String> containString, String word){

            if(containString.contains(word)){

                System.out.println("True.");
                System.out.println("The word has been found.");
                return true;
                }
            else {
                containString.add(word);
                System.out.println("False.");
                System.out.println("The word has NOT been found and has been added to the list.");
                System.out.println(containString);
                return false;
            }
    }
}
