package org.societies.api.sieging;

import org.societies.bridge.Location;

/**
 *
 */
public interface CityPublisher {

    City publish(String name, Location cityLocation, Besieger group);

    City publish(City city, Besieger group);
}
