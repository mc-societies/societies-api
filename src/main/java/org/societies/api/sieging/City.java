package org.societies.api.sieging;

import org.societies.bridge.Location;

import java.util.Set;
import java.util.UUID;

/**
 * Represents a City
 */
public interface City {

    void addLand(Land land);

    Set<Land> getLands();

    boolean removeLand(UUID uuid);

    /**
     * @return The location of a bind-stone
     */
    Location getLocation();
}
