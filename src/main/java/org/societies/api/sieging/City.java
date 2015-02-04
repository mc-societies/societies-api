package org.societies.api.sieging;

import org.societies.bridge.Location;

import java.util.Collection;
import java.util.UUID;

/**
 * Represents a City
 */
public interface City {

    UUID getUUID();

    String getName();

    Besieger getOwner();

    void addLand(Land land);

    Collection<Land> getLands();

    boolean removeLand(UUID uuid);

    /**
     * @return The location of a bind-stone
     */
    Location getLocation();
}
