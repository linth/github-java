package example.ExceptionExample;

/**
 * 建立基礎例外處理的class, 跟NrBaseException, NrDataException class類似
 */
public class BaseException extends RuntimeException {

    public BaseException() {
        super();
    }

    public BaseException(String message, Throwable cause) {
        super(message, cause);
    }

    public BaseException(String message) {
        super(message);
    }

    public BaseException(Throwable cause) {
        super(cause);
    }
}

