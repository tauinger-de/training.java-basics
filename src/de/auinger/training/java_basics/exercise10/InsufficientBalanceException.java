package de.auinger.training.java_basics.exercise10;

/**
 * Diese Exception signalisiert, dass nicht genug Geld auf dem Konto für eine Überweisung ist.
 */
public class InsufficientBalanceException extends RuntimeException {

    public InsufficientBalanceException(String message) {
        super(message);
    }
}
