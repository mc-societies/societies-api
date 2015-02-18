package org.societies.api.sieging;

import com.google.common.base.Function;
import org.societies.bridge.Location;

import java.util.UUID;

/**
 * Represents a CityProvider
 */
public interface CityProvider {

    City getCity(UUID uuid);

    City getCity(String name);

    City getCity(Location location);

    City getCity(Location location, double distance);

    City getCity(Location location, Function<Integer, Double> distance);
}
