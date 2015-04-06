package org.societies.api.sieging;

import org.joda.time.DateTime;
import org.joda.time.Duration;
import org.societies.api.math.Location;

import java.util.UUID;

/**
 * Represents a Siege
 */
public interface Siege {

    UUID getUUID();

    Besieger getBesieger();

    City getCity();

    Wager getWager();

    /**
     * @return The location of the siege-stone
     */
    Location getLocationInitiated();

    DateTime getTimeInitiated();

    DateTime getStartTime();

    Duration getDurationUntilStart();

    boolean isStarted();

    void send(String message);

    void send(String message, Object... obj);
}
