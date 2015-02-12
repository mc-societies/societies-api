package org.societies.api.sieging;

import com.google.inject.Inject;

import javax.annotation.Nullable;

/**
 * Represents a SimpleActionValidator
 */
public class SimpleActionValidator extends AbstractActionValidator {

    @Inject
    protected SimpleActionValidator(CityProvider cityProvider) {
        super(cityProvider);
    }

    @Override
    public boolean can(Action action, Besieger besieger, @Nullable City city) {
        return city == null;
    }
}
