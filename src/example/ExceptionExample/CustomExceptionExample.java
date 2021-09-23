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

/**
 * 建立異常class
 */
class BaseCustomException extends RuntimeException {
    //! 確認繼承 RuntimeException 和 Exception 差異
    private Integer code;
    private String message;

    public BaseCustomException(Integer code, String message) {
        super(message);
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}

public class CustomExceptionExample {       
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("Custom exception example.");
        boolean isButton = true;

        try {
            logger.info("go into the try block...");

            if (isButton == true) {
                // 應該可以使用類似 HttpStatus 之類物件輸入 code.
                throw new BaseCustomException(500, "This is base exception.");
            } else {
                throw new DefinedCustomException("This is my defined exception.");
            }

        } catch (DefinedCustomException e) {
            logger.warning("go into the catch block...");
            logger.warning(e + "; Error message: " + e.s);
        } catch (BaseCustomException e) {
            logger.warning("go into the catch block...");
            logger.warning("[Error] BaseCustomException, [code] " + e.getCode() + "; [message] " + e.getMessage() + "; [toString] " + e.toString());
        } catch (Exception e) {
            logger.warning("this is exception block...");
            logger.warning(e.toString());
        }
    }
}
