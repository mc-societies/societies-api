package org.societies.api.sieging;

import com.google.common.util.concurrent.ListenableFuture;

/**
 * Represents a BesiegerPublisher
 */
public interface BesiegerPublisher {

    ListenableFuture<Besieger> publish(Besieger besieger);
}
