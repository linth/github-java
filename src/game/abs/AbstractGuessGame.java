package game.abs;

interface InterfaceGuessGame {
    public void process();

    abstract void sayWelcome();
    abstract void sayStart();
    abstract void sayExcute();
    abstract void sayEnd();
}

public abstract class AbstractGuessGame implements InterfaceGuessGame {

    public void process() {
        sayWelcome();
        sayStart();
        sayExcute();
        sayEnd();
    }    
    // protected abstract void sayWelcome();
    // protected abstract void sayStart();
    // protected abstract void sayExcute();
    // protected abstract void sayEnd();
} 
