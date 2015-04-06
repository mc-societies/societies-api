package org.societies.api.sieging;

import com.google.common.base.Optional;
import org.societies.api.math.Location;

import javax.inject.Inject;

/**
 * Represents a AbstractActionValidator
 */
public abstract class AbstractActionValidator implements ActionValidator {

    private final CityProvider cityProvider;

    @Inject
    protected AbstractActionValidator(CityProvider cityProvider) {
        this.cityProvider = cityProvider;
    }

    @Override
    public boolean can(int action, Besieger besieger, Location location) {
        Optional<City> city = cityProvider.getCity(location);

        return besieger == null || !city.isPresent() || can(action, besieger, city.get());
    }
}
