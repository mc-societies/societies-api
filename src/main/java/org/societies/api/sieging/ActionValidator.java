package org.societies.api.sieging;

import org.societies.bridge.Location;

import javax.annotation.Nullable;

/**
 * Represents a PermissionChecker
 */
public interface ActionValidator {

    boolean canInteract(@Nullable Besieger besieger, Location location);

    boolean canInteract(@Nullable Besieger besieger, @Nullable City city);

    boolean canDestroy(@Nullable Besieger besieger, Location location);

    boolean canDestroy(@Nullable Besieger besieger, @Nullable City city);

    boolean canBuild(@Nullable Besieger besieger, Location location);

    boolean canBuild(@Nullable Besieger besieger, @Nullable City city);
}
