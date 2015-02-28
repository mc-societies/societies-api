package org.societies.api.sieging;

import com.google.common.base.Optional;

import java.util.UUID;

/**
 * Represents a BesiegerProvider
 */
public interface BesiegerProvider {

    Optional<Besieger> getBesieger(UUID uuid);
}
