package org.societies.api.sieging;

import org.joda.time.DateTime;
import org.societies.api.math.Location;
import org.societies.groups.Linkable;

import java.util.Collection;
import java.util.UUID;

/**
 * Represents a City
 */
public interface City extends Linkable {

    UUID getUUID();

    String getName();

    Besieger getOwner();

    void setOwner(Besieger owner);

    void addLand(Land land);

    Collection<Land> getLands();

    boolean removeLand(UUID uuid);

    void clearLands();

    /**
     * @return The location of a bind-stone
     */
    Location getLocation();

    double getRadius();

    double distance(Location location);

    DateTime getFounded();
}
