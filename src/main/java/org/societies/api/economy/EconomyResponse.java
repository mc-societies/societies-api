package org.societies.api.economy;

/**
 * Represents a EconomyResponse
 */
public class EconomyResponse {

    private final double amount;
    private final double balance;
    private final boolean success;

    public EconomyResponse(double amount, double balance, boolean success) {
        this.amount = amount;
        this.balance = balance;
        this.success = success;
    }

    public boolean transactionSuccess() {
        return success;
    }

    public double getAmount() {
        return amount;
    }

    public double getBalance() {
        return balance;
    }
}
