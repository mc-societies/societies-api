package org.societies.api.lock;

/**
 * Represents a DummyLocker
 */
public class DummyLocker implements Locker {
    @Override
    public boolean lock(int id) {
        return true;
    }

    @Override
    public boolean unlock(int id) {
        return true;
    }

    @Override
    public boolean isLocked(int id) {
        return false;
    }

    @Override
    public boolean isFree(int id) {
        return true;
    }
}
