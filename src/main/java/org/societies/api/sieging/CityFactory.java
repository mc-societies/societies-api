package org.societies.api.sieging;

import org.societies.bridge.Location;

import java.util.UUID;

/**
 * Represents a CityFactory
 */
public interface CityFactory {

    City create(UUID uuid, Location location);
}
