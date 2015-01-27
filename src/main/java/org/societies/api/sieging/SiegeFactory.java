package org.societies.api.sieging;

import org.societies.bridge.Location;
import org.societies.groups.group.Group;

/**
 * Represents a SiegeFactory
 */
public interface SiegeFactory {

    Siege create(Group besieger, City city, Location location);

    Siege create(Group besieger, City city, Location location, Wager wager);
}
