package org.societies.api.sieging;

import org.societies.groups.group.Group;

import java.util.Set;
import java.util.UUID;

/**
 * Can be a Group e.g
 */
public interface Besieger {

    UUID getUUID();

    Group getGroup();

    void addCity(City city);

    void removeCity(String name);

    City getCity(String name);

    void removeCity(City city);

    Set<City> getCities();
}
