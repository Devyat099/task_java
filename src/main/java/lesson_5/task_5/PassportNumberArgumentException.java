package lesson_5.task_5;

public class PassportNumberArgumentException extends PassportIllegalArgumentException {
    public PassportNumberArgumentException() {
    }

    public PassportNumberArgumentException(String message) {
        super(message);
    }

    public PassportNumberArgumentException(String message, Throwable cause) {
        super(message, cause);
    }

    public PassportNumberArgumentException(Throwable cause) {
        super(cause);
    }

    public PassportNumberArgumentException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}