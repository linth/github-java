package game.concrete;

import game.abs.AbstractGuessGame;
// import java.util.Scanner;

public class ConcreteGuessGame extends AbstractGuessGame {
    // private Scanner scanner;

    // public ConcreteGuessGame() {
    //     scanner = new Scanner(System.in);
    // }

    // public void showMessage(String message) {
    //     System.out.println(message + "!");
    // }

    // protected int getUserInput() {
    //     return scanner.nextInt();
    // }

    public void sayWelcome() {
        System.out.println("Welcome to the game.");
    }

    public void sayStart() {
        System.out.println("Starting the game.");
    }

    public void sayExcute() {
        System.out.println("Excuting the game.");
    }

    public void sayEnd() {
        System.out.println("Ending the game.");
    }
}
