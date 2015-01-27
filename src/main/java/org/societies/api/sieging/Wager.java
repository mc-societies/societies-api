package org.societies.api.sieging;

import org.societies.groups.group.Group;

import java.util.UUID;

/**
 * Represents a Wager
 */
public interface Wager {

    UUID getUUID();

    void apply(Group group);
}
