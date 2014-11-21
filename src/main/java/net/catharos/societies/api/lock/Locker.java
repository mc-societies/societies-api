package net.catharos.societies.api.lock;

import com.google.common.util.concurrent.ListenableFuture;

/**
 * Represents a Locker
 */
public interface Locker {

    ListenableFuture<Boolean> lock(int id);

    ListenableFuture<Boolean> unlock(int id);

    ListenableFuture<Boolean> isLocked(int id);

    ListenableFuture<Boolean> isFree(int id);
}
