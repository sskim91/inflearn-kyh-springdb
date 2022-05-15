package hello.jdbc.repository.ex;

/**
 * Created by sskim on 2022/05/15
 */
public class MyDbException extends RuntimeException{
    public MyDbException() {
        super();
    }

    public MyDbException(String message) {
        super(message);
    }

    public MyDbException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyDbException(Throwable cause) {
        super(cause);
    }
}
