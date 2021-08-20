package example.ExceptionExample;

/**
 * 建立NrBaseException class, 跟 BaseException class, NrDataException claass類似。
 * This is a basic NrBaseException class.
 * 
 */
public class NrBaseException extends RuntimeException {
    protected String message;
    
    public NrBaseException() {
        super();
    }

    public NrBaseException(String message, Throwable cause) {
        super(message, cause);
        this.message = message;
    }

    public NrBaseException(String message) {
        super(message);
        this.message = message;
    }

    public NrBaseException(Throwable cause) {
        super(cause);
    }
}

