import java.util.ArrayList;

public class Bibliotek {

    private ArrayList<Bog> boeger;
    // constructor
    public Bibliotek() {
        this.boeger = new ArrayList<>();
        boeger.add(new Bog(12345678, "Dagbog", 2019));
        boeger.add(new Bog(22233344, "Datastrukturer", 2020));
        boeger.add(new Bog(33445566, "Poetiske Landskaber", 1971));
    }
    // search book list
    public boolean searchLibrary(Bog searchBook) {
        // for each loop to parse through each element of the ArrayList
        // and compare ISBN numbers with the help of an empty searchBook container
        for (Bog books : boeger) {
            if (searchBook.getIsbnnummer() == books.getIsbnnummer())
                return true;
        }
        return false;
    }
    public void printContent(){
        // for each loop to parse through each element of the ArrayList
        // and print it
        for (Bog books : boeger) {
            System.out.println(books);
        }
    }
}
