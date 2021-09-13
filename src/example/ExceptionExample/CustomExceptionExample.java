package example.ExceptionExample;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 定義custom exception class.
 */
class DefinedCustomException extends Exception {
    String s;

    DefinedCustomException(String msg) {
        s = msg;
    }

    public String toString() {
        return ("My defined exception. " + s);
    }
}

public class CustomExceptionExample {       
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("Custom exception example.");
        logger.setLevel(Level.INFO);

        try {
            logger.info("go into the try block...");
            throw new DefinedCustomException("This is my defined exception.");
        } catch (DefinedCustomException e) {
            logger.warning("go into the catch block...");
            logger.warning(e + "; Error message: " + e.s);
        } catch (Exception e) {
            logger.warning("this is exception block...");
            logger.warning(e.toString());
        }
    }
}
