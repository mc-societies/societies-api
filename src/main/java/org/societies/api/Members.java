package org.societies.api;

import gnu.trove.set.hash.THashSet;
import org.bukkit.entity.Player;
import org.societies.groups.member.Member;

import java.util.Set;

/**
 * Represents a Members
 */
public final class Members {

    private Members() {
    }

    public static int countOnline(Set<Member> members) {
        int online = 0;

        for (Member member : members) {
            if (member.get(Player.class).isOnline()) {
                online++;
            }
        }

        return online;
    }

    public static Set<Member> onlineMembers(Set<Member> members) {
        Set<Member> ret = new THashSet<Member>();

        for (Member member : members) {
            if (member.get(Player.class).isOnline()) {
                ret.add(member);
            }
        }

        return ret;
    }
}
