package org.societies.api.sieging;

import java.util.UUID;

/**
 * Represents a BesiegerProvider
 */
public interface BesiegerProvider {

    Besieger getBesieger(UUID uuid);
}
