// Søgning
// Skriv en metode, der som parametre modtager et array af typen String samt en String.
// Metoden skal undersøge om strengen findes i arrayet. Metoden skal returnere indekspositionen,
// hvis strengen findes i arrayet og –1 hvis strengen ikke findes i arrayet.
// Lav en alternativ fejlhåndtering, hvis strengen ikke findes i arrayet, hvor du i stedet kaster en exception.

public class Soegning {

    public static void main(String[] args) {

        String[] words = {"Hello", "World", "How", "are", "you", "today"};
        String s = "Today";

        for (int i = 0; i < words.length; i++) {
            if (s.equalsIgnoreCase(words[i])) {
                System.out.println("\nThe word " + s + " was found at index " + i + ".");

            } else if (i == words.length - 1) {
                System.out.println("\nThe word " + s + " was NOT found in the Array (-1).");
            }
        }
        ReturnExcept.returnExcept();
    }
}
// Alternative method with try / catch
class ReturnExcept {

    public static void returnExcept() {

        String[] words2 = {"Jean", "learns", "Java", "programming", "at", "KEA"};
        String s2 = "kea";

        try {
            for (int j = 0; j < words2.length; j++) {
                if (s2.equalsIgnoreCase(words2[j])) {
                    System.out.println("\nThe word " + s2 + " was found at index " + j + ".");
                }
            }
        }
        catch (Exception e) {
            System.err.println("Error " + e);
        }
    }
}