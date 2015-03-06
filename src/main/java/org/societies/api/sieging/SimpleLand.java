package org.societies.api.sieging;

import java.util.UUID;

/**
 * Represents a MemoryLand
 */
public class SimpleLand implements Land {

    private final UUID uuid;

    private final UUID origin;

    public SimpleLand(UUID uuid, UUID origin) {
        this.uuid = uuid;
        this.origin = origin;
    }

    @Override
    public UUID getUUID() {
        return uuid;
    }

    @Override
    public UUID getOrigin() {
        return origin;
    }
}
