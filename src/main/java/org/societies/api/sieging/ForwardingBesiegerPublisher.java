package org.societies.api.sieging;

import com.google.inject.Inject;
import org.societies.groups.group.GroupPublisher;

/**
 * Represents a BesiegerPublisher
 */
public class ForwardingBesiegerPublisher implements BesiegerPublisher {

    private final GroupPublisher groupPublisher;

    @Inject
    public ForwardingBesiegerPublisher(GroupPublisher groupPublisher) {
        this.groupPublisher = groupPublisher;
    }

    @Override
    public Besieger publish(final Besieger besieger) {
        return groupPublisher.publish(besieger.getGroup()).get(Besieger.class);
    }
}
