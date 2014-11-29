package net.catharos.societies.api;

import net.catharos.bridge.Player;
import net.catharos.groups.Member;

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
            if (player.isAvailable()) {
                return true;
            }
        }

        return false;
    }
}
