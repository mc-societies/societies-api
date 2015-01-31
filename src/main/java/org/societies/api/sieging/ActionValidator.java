package org.societies.api.sieging;

import org.societies.bridge.Location;

/**
 * Represents a PermissionChecker
 */
public interface ActionValidator {

    boolean canInteract(Location location);

    boolean canDestroy(Location location);

    boolean canBuild(Location location);
}
