package example.ExceptionExample;

/**
 * 建立 NrDataException class, 跟 BaseException class, NrBaseException claass類似。
 */
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
