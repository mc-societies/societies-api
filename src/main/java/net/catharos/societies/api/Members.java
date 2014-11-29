package net.catharos.societies.api;

import gnu.trove.set.hash.THashSet;
import net.catharos.groups.Member;
import net.catharos.societies.api.member.SocietyMember;

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
            if (member.getExtension(SocietyMember.class).isAvailable()) {
                online++;
            }
        }

        return online;
    }

    public static Set<Member> onlineMembers(Set<Member> members) {
        Set<Member> ret = new THashSet<Member>();

        for (Member member : members) {
            if (member.getExtension(SocietyMember.class).isAvailable()) {
                ret.add(member);
            }
        }

        return ret;
    }
}
