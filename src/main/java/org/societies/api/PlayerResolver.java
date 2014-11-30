package org.societies.api;

import java.util.UUID;

/**
 * Represents a PlayerProvider
 */
public interface PlayerResolver {

    UUID getPlayer(String name);

    boolean isAvailable(String name);

    boolean isAvailable(UUID uuid);

}
