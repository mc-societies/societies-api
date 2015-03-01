package org.societies.api.sieging;

import java.util.UUID;

/**
 * Represents a SpareLand
 */
public class SpareLand implements Land {

    private final UUID uuid;

    public SpareLand(UUID uuid) {this.uuid = uuid;}

    @Override
    public UUID getUUID() {
        return uuid;
    }

    @Override
    public City getOrigin() {
        return null;
    }
}
