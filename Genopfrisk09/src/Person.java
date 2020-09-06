

public class Person implements Comparable<Person>{

    private String name;
    private double height;
    private int age;

    public Person(String name, double height, int age){
        this.name=name;
        this.age=age;
        this.height=height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public int compareTo(Person st){
        if(age==st.age)
            return 0;
        else if(age<st.age)
            return 1;
        else
            return -1;
    }
}

