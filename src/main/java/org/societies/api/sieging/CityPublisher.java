package org.societies.api.sieging;

import com.google.common.util.concurrent.ListenableFuture;
import org.societies.groups.group.Group;

/**
 *
 */
public interface CityPublisher {

    ListenableFuture<City> publish(City city, Group group);
}
