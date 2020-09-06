import java.util.*;

public class Sort01 {

        public static void main(String args[]){

            ArrayList<Person> persons =new ArrayList<Person>();
            persons.add(new Person("Martin", 1.80, 44));
            persons.add(new Person("Irina", 1.67, 40));
            persons.add(new Person("Kristine", 1.77, 42));
            persons.add(new Person("Jean", 1.78,49));
            persons.add(new Person("Natalia", 1.72,42));

            System.out.println("\nAn older person is sorted higher in the natural ordering.\nIf two persons are the same age, the taller person\nis sorted higher in the natural ordering:\n");

            Collections.sort(persons);
            for(Person st : persons){
                System.out.println("Name: " + st.getName() + " - Age: " + st.getAge() + " - Height: " + st.getHeight());
            }
        }
}
