package org.societies.api.sieging;

import com.google.common.base.Function;
import com.google.common.base.Optional;
import org.societies.api.math.Location;

import java.util.UUID;

/**
 * Represents a CityProvider
 */
public interface CityProvider {

    Optional<City> getCity(UUID uuid);

    Optional<City> getCity(String name);

    Optional<City> getNearestCity(Location location);

    Optional<City> getCity(Location location);

    Optional<City> getCity(Location location, double distance);

    Optional<City> getCity(Location location, Function<Integer, Double> distance);
}
