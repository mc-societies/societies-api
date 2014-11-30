package org.societies.api.economy;

import net.milkbowl.vault.economy.EconomyResponse;

/**
 * Represents a EconomyParticipant
 */
public interface EconomyParticipant {

    EconomyResponse withdraw(double amount);

    EconomyResponse deposit(double amount);
}
