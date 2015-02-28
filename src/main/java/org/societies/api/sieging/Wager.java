package org.societies.api.sieging;

import org.societies.groups.group.Group;

import java.util.UUID;

/**
 * Represents a Wager
 */
public interface Wager {

    UUID getUUID();

    boolean apply(Group group);

    boolean fulfill(Group group);
}
