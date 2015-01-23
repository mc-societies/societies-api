package org.societies.api.sieging;

import org.societies.bridge.Location;
import org.societies.groups.group.Group;

/**
 * Represents a SiegeController
 */
public interface SiegeController {

    Siege start(Group group, City city, Location location);

    Siege start(Group group, City city, Location location, Wager wager);

    void stop(Group group, City city);
}
