package org.societies.api.sieging;

import org.joda.time.DateTime;
import org.societies.bridge.Location;
import org.societies.groups.Linkable;
import org.societies.groups.setting.subject.Subject;

import java.util.Collection;
import java.util.UUID;

/**
 * Represents a City
 */
public interface City extends Linkable, Subject {

    @Override
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

    DateTime getFounded();
}
