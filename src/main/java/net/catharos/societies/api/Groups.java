package net.catharos.societies.api;

import net.catharos.groups.Member;
import net.catharos.societies.api.member.SocietyMember;

import java.util.Set;

/**
 * Represents a Groups
 */
public class Groups {

    private Groups() {
    }

    public static boolean isActive(Set<Member> members) {
        //todo return false if getLastActive is old
        for (Member member : members) {
            SocietyMember extension = member.getExtension(SocietyMember.class);
            if (extension.isAvailable()) {
                return true;
            }
        }

        return false;
    }
}
