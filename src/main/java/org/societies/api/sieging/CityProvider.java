package org.societies.api.sieging;

import java.util.UUID;

/**
 * Represents a CityProvider
 */
public interface CityProvider {

    City getCity(UUID uuid);

}
