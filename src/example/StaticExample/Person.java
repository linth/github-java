package example.StaticExample;

/**
 * static field and static method.
 * 
 * Reference:
 *  - https://www.liaoxuefeng.com/wiki/1252599548343744/1260464690677856
 * 
 */
public class Person implements Human {
    public String name;
    public int age;

    public static int number; // static field.
    
    public Person() {

    }

    public Person(String n, int a) {
        this.name = n;
        this.age = a;
    }

    public static void setNumber(int value) {
        number = value;
    }
}