package org.societies.api;

import org.bukkit.entity.Player;
import org.societies.groups.member.Member;

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
            Player player = member.get(Player.class);
            if (player.isOnline()) {
                return true;
            }
        }

        return false;
    }
}
