package example.ExceptionExample;

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
        try {
            System.out.println("go into the try block...");
            throw new DefinedCustomException("This is my defined exception.");
        } catch (DefinedCustomException e) {
            System.out.println("go into the catch block...");
            System.out.println(e + "; Error message: " + e.s);
        } catch (Exception e) {
            System.out.println("this is exception block...");
            System.out.println(e);
        }
    }
}
