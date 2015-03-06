package org.societies.api.sieging;

import org.societies.groups.group.Group;

import java.util.Collection;
import java.util.Set;
import java.util.UUID;

/**
 * Can be a Group e.g
 */
public interface Besieger {

    UUID getUUID();

    Group getGroup();

    void addCity(City city);

    void addCities(Iterable<City> cities);

    void removeCity(String name);

    Set<Land> getUnallocatedLands();

    void addUnallocatedLand(Land land);

    void removeUnallocatedLand(Land land);

    void addUnallocatedLands(Collection<Land> lands);

    City getCity(String name);

    void removeCity(City city);

    Set<City> getCities();
}
