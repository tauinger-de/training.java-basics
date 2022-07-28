package de.auinger.training.java_basics.exercise11;

public class Transaction {

    private final String counterAccountNumber;
    private final String purpose;
    private final double amount;

    public Transaction(String counterAccountNumber, String purpose, double amount) {
        this.counterAccountNumber = counterAccountNumber;
        this.purpose = purpose;
        this.amount = amount;
    }

    public String getCounterAccountNumber() {
        return counterAccountNumber;
    }

    public String getPurpose() {
        return purpose;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Transaction [amount=" + amount + ", counterAccountNumber='" + this.counterAccountNumber
                + "', purpose='" + purpose + "']";
    }
}
