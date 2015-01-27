package org.societies.api.sieging;

import com.google.common.util.concurrent.ListenableFuture;

import java.util.UUID;

/**
 * Represents a BesiegerProvider
 */
public interface BesiegerProvider {

    ListenableFuture<Besieger> getBesieger(UUID uuid);
}
