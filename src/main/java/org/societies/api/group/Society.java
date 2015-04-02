package org.societies.api.group;

import org.societies.bridge.Location;

import java.util.Optional;

/**
 * Represents a SocietiesExtension
 */
public interface Society {

    double getBalance();

    void setBalance(double balance);

    boolean isVerified();

    void setVerified(boolean newState);

    boolean isFriendlyFire();

    void setFriendlyFire(boolean on);

    void setHome(Location home);

    void removeHome();

    Optional<Location> getHome();
}
