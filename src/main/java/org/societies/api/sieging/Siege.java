package org.societies.api.sieging;

import org.joda.time.DateTime;
import org.societies.bridge.Location;

/**
 * Represents a Siege
 */
public interface Siege {

    Besieger getBesieger();

    City getCity();

    Wager getWager();

    /**
     * @return The location of the siege-stone
     */
    Location getLocationInitiated();

    DateTime getTimeInitiated();
}
