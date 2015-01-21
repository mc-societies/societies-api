package org.societies.api.sieging;

import java.util.UUID;

/**
 * Represents a Land
 */
public interface Land {

    UUID getUUID();

    City getOrigin();
}
