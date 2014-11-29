package net.catharos.societies.api.member;

import net.catharos.bridge.Player;
import net.catharos.societies.api.economy.EconomyParticipant;

import java.util.Locale;

/**
 *
 */
public interface SocietyMember extends EconomyParticipant, Player {

    Locale getLocale();

    boolean hasPermission(String permission);
}
