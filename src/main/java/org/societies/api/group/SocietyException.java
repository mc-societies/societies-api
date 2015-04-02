package org.societies.api.group;

/**
 * Represents a MemberLoadingException
 */
public class SocietyException extends RuntimeException {

    public SocietyException() {
    }

    public SocietyException(String message) {
        super(message);
    }

    public SocietyException(String message, Throwable cause) {
        super(message, cause);
    }

    public SocietyException(Throwable cause) {
        super(cause);
    }

    public SocietyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
