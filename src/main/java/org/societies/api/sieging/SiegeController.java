package org.societies.api.sieging;

import org.societies.bridge.Location;
import org.societies.groups.group.Group;

import java.util.Set;

/**
 * Represents a SiegeController
 */
public interface SiegeController {

    Siege start(Group group, City city, Location location);

    Siege start(Group group, City city, Location location, Wager wager);

    Set<Siege> getSieges(City city);

    Set<Siege> getSieges(Group group);

    Set<Siege> getSiegesAgainst(Group group);

    void stop(Group group, City city);
}
