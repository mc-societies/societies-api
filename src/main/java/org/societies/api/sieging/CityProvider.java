package org.societies.api.sieging;

import org.societies.bridge.Location;

import java.util.UUID;

/**
 * Represents a CityProvider
 */
public interface CityProvider {

    City getCity(UUID uuid);

    City getCity(String name);

    City getCity(Location location);
}
