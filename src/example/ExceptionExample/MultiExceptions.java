package example.ExceptionExample;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Error exception.
 * 
 * Throwable 有兩個分類：Exception 和 Error.
 * 
 *       ----------
 *      |  object  |
 *       ----------
 *           ^
 *           |
 *       -----------
 *      | Throwable |
 *       -----------
 *        ^       ^
 *       /         \
 *   -------      -----------
 *  | Error |    | Exception |
 *   -------      -----------
 * 
 * 
 * Error
 *  - OutOfMemoryError
 *  - NoClassDefFoundError
 *  - StackOverflowError 
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
 * ! printStackTrace：在重重的方法呼叫下，例外發生的點可能是在某個方法之中，若想得知例外發生的根源，以及重重方法呼叫下傳播的呼叫堆疊，則可以利用例外物件所自動收集的堆疊追蹤（Stack Trace）來取得相關的資訊。
 * 
 * Reference:
 *  - https://www.liaoxuefeng.com/wiki/1252599548343744/1264734349295520
 *  - https://dzone.com/articles/9-best-practices-to-handle-exceptions-in-java
 *  - https://openhome.cc/Gossip/JavaEssence/StackTrace.html
 */
public class MultiExceptions {
    Logger logger = Logger.getLogger("MultiExceptions");
    // logger.setLevel(Level.ALL);

    public static void main(String[] args) {       
        // TODO: log + error exception handling.

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
        } catch (NullPointerException e) {
            logger.warning("process 1: NullPointerException 錯誤");
            throw new NullPointerException("process1 的 NullPointerException");
        } catch (Exception e) {
            e.printStackTrace();
            throw new IllegalArgumentException();
        } finally {
            System.out.println("finish the process1() function...");
        }
    }

    public void process2() {
        try {
            process3();
        } catch (NullPointerException e) {
            logger.warning("process 2: NullPointerException 錯誤");
            e.printStackTrace();
            throw new NullPointerException("process2 的 NullPointerException");
        } catch (Exception e) {
            throw new IllegalArgumentException();
        } finally {
            System.out.println("finish the process2() function...");
        }
    }

    public void process3() {
        // System.out.println("finish the process3() function...");
        try {
            logger.warning("process 3: NullPointerException 錯誤");
            throw new NullPointerException("process3 的 NullPointerException");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
