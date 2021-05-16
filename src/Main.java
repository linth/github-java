// package src;

/**
 * Main
 */
// import src.game.concrete.ConcreteGuessGame;
import game.concrete.ConcreteGuessGame;
import game.fun.MultiFunc;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world.");

        ConcreteGuessGame c = new ConcreteGuessGame();
        c.process();

        MultiFunc m = new MultiFunc("george", 1984);
        System.out.println(m.getAge());
    }
}