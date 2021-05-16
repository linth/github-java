package game.concrete;

/**
 * Reference:
 *  - https://www.liaoxuefeng.com/wiki/1252599548343744/1260454256258656
 */

import game.abs.Person;

public class Man extends Person {
    
    public Man() {

    }

    public Man(String n, int b) {
        super(n, b);
    }

    public void showHello() {
        System.out.println("This is Man showHello()...");
    }

    public void show() {
        System.out.println("Do not any input argument for show()...");
    }

    public void show(String s) {
        // Overload.
        System.out.println("Have input argument: (string) " + s + " for show()...");
    }
    
    public void show(int a) {
        // Overload.
        System.out.println("Have input argument: (int) " + a + " for show()...");
    }
}
