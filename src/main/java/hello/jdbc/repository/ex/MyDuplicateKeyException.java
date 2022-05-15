package hello.jdbc.repository.ex;

/**
 * Created by sskim on 2022/05/15
 */
public class MyDuplicateKeyException extends MyDbException {
    public MyDuplicateKeyException() {
        super();
    }

    public MyDuplicateKeyException(String message) {
        super(message);
    }

    public MyDuplicateKeyException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyDuplicateKeyException(Throwable cause) {
        super(cause);
    }
}
