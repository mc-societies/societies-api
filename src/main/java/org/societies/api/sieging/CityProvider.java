package org.societies.api.sieging;

import com.google.common.util.concurrent.ListenableFuture;

import java.util.UUID;

/**
 * Represents a CityProvider
 */
public interface CityProvider {

    ListenableFuture<City> getCity(UUID uuid);

}
