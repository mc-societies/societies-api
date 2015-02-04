package org.societies.api.sieging;

import org.societies.bridge.Location;
import org.societies.groups.group.Group;

import java.util.Set;
import java.util.UUID;

/**
 * Represents a SiegeController
 */
public interface SiegeController {

    Siege start(Besieger besieger, City city, Location location);

    Siege start(Besieger besieger, City city, Location location, Wager wager);

    Siege getSiege(UUID uuid);

    Set<Siege> getSieges(City city);

    Set<Siege> getSieges(Besieger besieger);

    Set<Siege> getSiegesAgainst(Group victim);

    void stop(Siege siege);
}
