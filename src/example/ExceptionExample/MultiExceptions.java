package example.ExceptionExample;

/**
 * Error exception.
 *  
 * 
 * Exception
 *  - RuntimeException
 *      - NullPointerException
 *      - IndexOutOfBoundsException
 *      - SecurityException
 *      - IllegalArgumentException
 *          - NumberFormatException
 *  - IOException
 *      - UnsupportedCharsetException
 *      - FileNotFoundException
 *      - SocketException
 *  - ParseException
 *  - GeneralSecurityException
 *  - SQLException
 *  - TimeoutException
 * 
 * 
 * Reference:
 *  - https://www.liaoxuefeng.com/wiki/1252599548343744/1264734349295520
 */
public class MultiExceptions {
    public static void main(String[] args) {
        try {
            MultiExceptions me = new MultiExceptions();
            me.process1();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("finish the main() function...");
        }
    }

    public void process1() {
        try {
            process2();
        } catch (Exception e) {
            throw new IllegalArgumentException();
        } finally {
            System.out.println("finish the process1() function...");
        }
    }

    public void process2() {
        try {
            process3();
        } catch (Exception e) {
            throw new IllegalArgumentException();
        } finally {
            System.out.println("finish the process2() function...");
        }
    }

    public void process3() {
        System.out.println("finish the process3() function...");
        throw new NullPointerException();
    }
}
