package org.societies.api.sieging;

import org.societies.bridge.Location;

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
    public boolean can(Action action, Besieger besieger, Location location) {
        return can(action, besieger, cityProvider.getCity(location));
    }
}
