package org.societies.api.sieging;

import org.societies.bridge.Location;

import javax.annotation.Nullable;

/**
 * Represents a PermissionChecker
 */
public interface ActionValidator {

    boolean can(int action, @Nullable Besieger besieger, Location location);

    boolean can(int action, @Nullable Besieger besieger, @Nullable City city);

    public static class Action {
        public static int INTERACT = 0x1;
        public static int DESTROY = 0x2;
        public static int BUILD = 0x3;
    }
}
