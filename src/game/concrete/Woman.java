package game.concrete;

import game.abs.Person;

public class Woman extends Person {
    
    public Woman() {

    }

    public Woman(String n, int b) {
        super(n, b);
    }

    @Override
    public void showHello() {
        System.out.println("This is Woman showHello()...");
    }
}
