package org.societies.api.sieging;

import com.google.common.base.Optional;
import org.societies.bridge.Location;

import java.util.Set;

/**
 * Represents a SiegeController
 */
public interface SiegeController {

    Siege start(Besieger besieger, City city, Location location);

    Siege start(Besieger besieger, City city, Location location, Wager wager);


    Optional<Siege> getSiegeInitiatedAt(Location location);

    Optional<Siege> getSiegeInitiatedNear(Location location);

    /**
     * @param location The location of the city
     * @return The siege
     */
    Optional<Siege> getSiegeByLocation(Location location);


    Set<Siege> getSiegesByLocation(City city);

    Optional<Siege> getSiegeByAttacker(Besieger besieger);

    void stop(Siege siege, Besieger winner);

    void cancel(Siege siege);
}
