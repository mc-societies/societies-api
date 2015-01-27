package org.societies.api.sieging;

import com.google.common.util.concurrent.ListenableFuture;
import org.societies.bridge.Location;
import org.societies.groups.group.Group;

import java.util.Set;
import java.util.UUID;

/**
 * Represents a SiegeController
 */
public interface SiegeController {

    ListenableFuture<Siege> start(Group group, City city, Location location);

    ListenableFuture<Siege> start(Group group, City city, Location location, Wager wager);

    ListenableFuture<Siege> getSiege(UUID uuid);

    ListenableFuture<Set<Siege>> getSieges(City city);

    ListenableFuture<Set<Siege>> getSieges(Group besieger);

    ListenableFuture<Set<Siege>> getSiegesAgainst(Group victim);

    void stop(Siege siege);
}
