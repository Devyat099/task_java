package lesson_5.task_5;

public class PassportIllegalArgumentException extends RuntimeException {
    public PassportIllegalArgumentException() {
    }

    public PassportIllegalArgumentException(String message) {
        super(message);
    }

    public PassportIllegalArgumentException(String message, Throwable cause) {
        super(message, cause);
    }

    public PassportIllegalArgumentException(Throwable cause) {
        super(cause);
    }

    public PassportIllegalArgumentException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}