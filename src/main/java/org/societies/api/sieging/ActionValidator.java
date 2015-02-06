package org.societies.api.sieging;

import org.societies.bridge.Location;

import javax.annotation.Nullable;

/**
 * Represents a PermissionChecker
 */
public interface ActionValidator {

    boolean canInteract(Besieger besieger, Location location);

    boolean canInteract(Besieger besieger, @Nullable City city);

    boolean canDestroy(Besieger besieger, Location location);

    boolean canDestroy(Besieger besieger, @Nullable City city);

    boolean canBuild(Besieger besieger, Location location);

    boolean canBuild(Besieger besieger, @Nullable City city);
}
