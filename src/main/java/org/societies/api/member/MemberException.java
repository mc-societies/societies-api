package org.societies.api.member;

import org.societies.api.PlayerRuntimeException;

import java.util.UUID;

/**
 * Represents a MemberLoadingException
 */
public class MemberException extends PlayerRuntimeException {

    public MemberException(UUID player) {
        super(player);
    }

    public MemberException(String message, UUID player) {
        super(message, player);
    }

    public MemberException(String message, Throwable cause, UUID player) {
        super(message, cause, player);
    }

    public MemberException(Throwable cause, UUID player) {
        super(cause, player);
    }

    public MemberException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, UUID player) {
        super(message, cause, enableSuppression, writableStackTrace, player);
    }
}
