package game.concrete;

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
}
