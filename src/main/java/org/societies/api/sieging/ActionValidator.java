package org.societies.api.sieging;

import org.societies.bridge.Location;

import javax.annotation.Nullable;

/**
 * Represents a PermissionChecker
 */
public interface ActionValidator {

    boolean can(Action action, @Nullable Besieger besieger, Location location);

    boolean can(Action action, @Nullable Besieger besieger, @Nullable City city);

    public static enum Action {
        INTERACT,
        DESTROY,
        BUILD
    }
}
