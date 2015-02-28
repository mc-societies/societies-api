package org.societies.api.sieging;

import org.societies.bridge.Location;

import java.util.Set;
import java.util.UUID;

/**
 * Represents a SiegeController
 */
public interface SiegeController {

    Siege start(Besieger besieger, City city, Location location);

    Siege start(Besieger besieger, City city, Location location, Wager wager);

    Siege getSiege(UUID uuid);

    Siege getSiege(Location location);

    /**
     *
     * @param location The location of the city
     * @return The siege
     */
    Set<Siege> getSieges(Location location);

    Set<Siege> getSieges(City city);

    Siege getSiegeByAttacker(Besieger besieger);

    void stop(Siege siege, Besieger winner);
}
