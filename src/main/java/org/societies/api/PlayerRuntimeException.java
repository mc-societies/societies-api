package org.societies.api;

import java.util.UUID;

/**
 * This exception indicates that something badly happened because of a player. So let this player be punished!
 */
public class PlayerRuntimeException extends RuntimeException {
    /**
     * The player name
     */
    private final UUID player;

    /**
     * Indicated if the player should be kicked
     */
    private boolean kick = true;


    public PlayerRuntimeException(UUID player) {
        this.player = player;
    }

    public PlayerRuntimeException(String message, UUID player) {
        super(message);
        this.player = player;
    }

    public PlayerRuntimeException(String message, Throwable cause, UUID player) {
        super(message, cause);
        this.player = player;
    }

    public PlayerRuntimeException(Throwable cause, UUID player) {
        super(cause);
        this.player = player;
    }

    public PlayerRuntimeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, UUID player) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.player = player;
    }

    public PlayerRuntimeException dontKick() {
        kick = false;

        return this;
    }

    /**
     * Returns the player name.
     *
     * @return The name
     */
    public UUID getPlayer() {
        return player;
    }

    /**
     * Returns whether or not the specified player should be kicked from the server.
     *
     * @return True if he should get kicked, false if not
     */
    public boolean shouldKick() {
        return kick;
    }

}
