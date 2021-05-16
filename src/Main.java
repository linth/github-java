// package src;

/**
 * Main
 */
// import src.game.concrete.ConcreteGuessGame;
import game.concrete.ConcreteGuessGame;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world.");

        ConcreteGuessGame c = new ConcreteGuessGame();
        c.process();
    }
}