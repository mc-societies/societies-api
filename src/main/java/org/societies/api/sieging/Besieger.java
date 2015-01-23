package org.societies.api.sieging;

import org.societies.groups.group.Group;

import java.util.Set;

/**
 * Can be a Group e.g
 */
public interface Besieger {

    Group getGroup();

    void addCity(City city);

    void removeCity(City city);

    Set<City> getCities();
}
