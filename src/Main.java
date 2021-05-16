// package src;

/**
 * Main
 */
// import src.game.concrete.ConcreteGuessGame;
import game.fun.MultiFunc;
import game.abs.*;
import game.concrete.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world.");

        ConcreteGuessGame c = new ConcreteGuessGame();
        c.process();

        MultiFunc m = new MultiFunc("george", 1984);
        System.out.println("Age: " + m.getAge() + " name: " + m.getName());

        Person p = new Person();
        Man man = new Man("Peter", 2001);
        Woman w = new Woman("may", 1999);

        p.showHello();
        man.showHello();
        w.showHello();
        System.out.println("name: " + man.getName() + " age: " + man.getAge());
    }
}