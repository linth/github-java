package example.ExceptionExample;

public class NrDataException extends NrBaseException {
    //! 有無比較精簡寫?

    public NrDataException() {
        super();
    }

    public NrDataException(String message, Throwable cause) {
        super(message, cause);
    }

    public NrDataException(String message) {
        super(message);
    }

    public NrDataException(Throwable cause) {
        super(cause);
    }
}
