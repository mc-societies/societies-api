package org.societies.api.group;

import com.google.common.base.Optional;
import org.societies.api.math.Location;


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
