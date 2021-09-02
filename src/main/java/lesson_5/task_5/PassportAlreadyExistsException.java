package lesson_5.task_5;

public class PassportAlreadyExistsException extends RuntimeException {
    public PassportAlreadyExistsException() {
    }

    public PassportAlreadyExistsException(String message) {
        super(message);
    }

    public PassportAlreadyExistsException(String message, Throwable cause) {
        super(message, cause);
    }

    public PassportAlreadyExistsException(Throwable cause) {
        super(cause);
    }

    public PassportAlreadyExistsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}