package game.abs;

import java.util.Calendar;


public class Person {
    protected String name;
    protected int age;
    protected int birth;
    private double height; // private var將會讓繼承的class都無法讀取
    private double weight;

    public Person() {
        // constructor.
    }
    
    public Person(String n, int b) {
        this.name = n;
        this.birth = b;
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

    public void showHello() {
        System.out.println("This is Person showHello()...");
    }

    public void setHeight(double h) {
        this.height = h;
    }

    public void setWeight(double w) {
        this.weight = w;
    }

    public double getHeight() {
        return this.height;
    }

    public double getWeight() {
        return this.weight;
    }
}
