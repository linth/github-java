package game.concrete;

/**
 * Reference
 *  - https://www.liaoxuefeng.com/wiki/1252599548343744/1260454548196032
 */
import game.abs.Person;

public class casting {
    
    /**
     * demo the downcasting and upcasting.
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Hello");

        // upcasting. (將一個child class安全的賦予 parent class類型)
        Woman w = new Woman("Mary", 1984);
        Person p = w;
        System.out.println("name: " + p.getName());

        // downcasting. (將一個parent class強制轉型成 child class)
        Person p1 = new SmallWoman();
        Person p2 = new Person();
        SmallWoman sw = (SmallWoman) p1;
        // StrongWoman stw = (StrongWoman) p2; // error.
    }
}
