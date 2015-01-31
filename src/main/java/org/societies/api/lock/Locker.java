package org.societies.api.lock;

/**
 * Represents a Locker
 */
public interface Locker {

    boolean lock(int id);

    boolean unlock(int id);

    boolean isLocked(int id);

    boolean isFree(int id);
}
