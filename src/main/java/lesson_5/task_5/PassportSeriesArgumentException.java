package lesson_5.task_5;

public class PassportSeriesArgumentException extends PassportIllegalArgumentException {
    public PassportSeriesArgumentException() {
    }

    public PassportSeriesArgumentException(String message) {
        super(message);
    }

    public PassportSeriesArgumentException(String message, Throwable cause) {
        super(message, cause);
    }

    public PassportSeriesArgumentException(Throwable cause) {
        super(cause);
    }

    public PassportSeriesArgumentException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}