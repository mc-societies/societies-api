package org.societies.api.lock;

import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;

/**
 * Represents a DummyLocker
 */
public class DummyLocker implements Locker {
    @Override
    public ListenableFuture<Boolean> lock(int id) {
        return Futures.immediateFuture(true);
    }

    @Override
    public ListenableFuture<Boolean> unlock(int id) {
        return Futures.immediateFuture(true);
    }

    @Override
    public ListenableFuture<Boolean> isLocked(int id) {
        return Futures.immediateFuture(false);
    }

    @Override
    public ListenableFuture<Boolean> isFree(int id) {
        return Futures.immediateFuture(true);
    }
}
