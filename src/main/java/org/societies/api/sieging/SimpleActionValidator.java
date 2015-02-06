package org.societies.api.sieging;

import org.societies.bridge.Location;

import javax.annotation.Nullable;
import javax.inject.Inject;

/**
 * Represents a SimpleActionValidator
 */
public class SimpleActionValidator implements ActionValidator {

    private final CityProvider cityProvider;

    @Inject
    public SimpleActionValidator(CityProvider cityProvider) {this.cityProvider = cityProvider;}

    @Override
    public boolean canInteract(Besieger besieger, Location location) {
        return canInteract(besieger, cityProvider.getCity(location));
    }

    @Override
    public boolean canDestroy(Besieger besieger, Location location) {
        return canDestroy(besieger, cityProvider.getCity(location));
    }

    @Override
    public boolean canBuild(Besieger besieger, Location location) {
        return canBuild(besieger, cityProvider.getCity(location));
    }

    @Override
    public boolean canInteract(Besieger besieger, @Nullable City city) {
        return city == null;
    }

    @Override
    public boolean canDestroy(Besieger besieger, @Nullable City city) {
        return city == null;
    }

    @Override
    public boolean canBuild(Besieger besieger, @Nullable City city) {
        return city == null;
    }
}
