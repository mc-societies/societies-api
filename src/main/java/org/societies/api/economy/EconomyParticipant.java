package org.societies.api.economy;

/**
 * Represents a EconomyParticipant
 */
public interface EconomyParticipant {

    EconomyResponse withdraw(double amount);

    EconomyResponse deposit(double amount);
}
