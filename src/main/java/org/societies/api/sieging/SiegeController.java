package org.societies.api.sieging;

import com.google.common.base.Optional;
import org.societies.bridge.Location;

import java.util.Set;
import java.util.UUID;

/**
 * Represents a SiegeController
 */
public interface SiegeController {

    Siege start(Besieger besieger, City city, Location location);

    Siege start(Besieger besieger, City city, Location location, Wager wager);

    Optional<Siege> getSiege(UUID uuid);

    Optional<Siege> getSiege(Location location);

    Optional<Siege> getSiegeByInitiatedLocation(Location location);

    /**
     *
     * @param location The location of the city
     * @return The siege
     */
    Set<Siege> getSieges(Location location);

    Set<Siege> getSieges(City city);

    Optional<Siege> getSiegeByAttacker(Besieger besieger);

    void stop(Siege siege, Besieger winner);

    void cancel(Siege siege);
}
