package org.societies.api;

import java.util.UUID;

/**
 * Represents a NameProvider
 */
public interface NameProvider {

    String getName(UUID uuid);
}
