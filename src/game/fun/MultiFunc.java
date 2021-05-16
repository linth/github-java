package game.fun;

import java.util.Calendar;

class Person {
    protected String name;
    protected int age;
    protected int birth;

    public Person() {

    }
    
    public Person(String n, int b) {
        this.name = n;
        this.birth = b;
    }
}

public class MultiFunc extends Person {

    public MultiFunc() {

    }

    public MultiFunc(String n, int b) {
        super(n, b);
        this.age = this.setAge();
    }
    
    public String getName() {
        /**
         * get the name.
         */
        return this.name;
    }

    public int getAge() {
        /**
         * get the age.
         */
        return this.age;
    }

    public void setName(String n) {
        /**
         * set the name.
         */
        if (n == null || n.isBlank()) {
            throw new IllegalArgumentException("invalid name.");
        }
        this.name = n.strip(); // remove the first/last empty space.
    }

    private int setAge() {
        /**
         * set the value of age.
         */
        int year = Calendar.getInstance().get(Calendar.YEAR);
        return year - this.birth;
    }
}
