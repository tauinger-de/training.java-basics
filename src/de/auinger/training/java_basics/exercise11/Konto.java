package de.auinger.training.java_basics.exercise11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Konto {

    // public
    // "" (default, package-private)
    // protected
    // private

    // byte -- 8 bit, -128 - +127
    // short -- 16
    // int -- 32
    // long -- 64

    // float
    // double

    // char
    // String


    //
    // --- Felder ---
    //

    private final String kontoNummer;

    private double kontoStand;

    private final String besitzer;

    private final List<Transaction> transactionList;

    //
    // --- Konstruktion ---
    //

    public Konto(String kontoNummer, String besitzer) {
        this(kontoNummer, 0.0, besitzer);
    }

    // ein Konstruktor ist auch nur eine Methode mit einem Namen. Der
    // analog der Klasse lautet und *NICHT* direkt aufgerufen werden kann.
    public Konto(String kontoNummer, double kontoStand, String besitzer) {
        try {
            ToolsFactory.getNameValidator().validateName(besitzer);
        } catch (ServiceNotAvailableException e) {
            // Name konnte nicht validiert werden... Daher markieren wir ihn durch Klammerung für später
            besitzer = "<<" + besitzer + ">>";
        }
        this.kontoNummer = kontoNummer;
        this.kontoStand = kontoStand;
        this.besitzer = besitzer;

        transactionList = new ArrayList<>();
    }

    //
    // --- Geschäftslogik ---
    //

    public void transfer(Konto zielKonto, double amount, String verwendungszweck) {
        debit(amount, zielKonto.kontoNummer, verwendungszweck);
        // bis hierhin kommen wir gar nicht erst, wenn in debit() eine Exception aufgetreten ist
        zielKonto.credit(amount, this.kontoNummer, verwendungszweck);
    }

    private void credit(double amount, String gegenKontoNummer, String verwendungszweck) {
        this.kontoStand += amount;
        this.transactionList.add(new Transaction(gegenKontoNummer, verwendungszweck, amount));
    }

    private void debit(double amount, String gegenKontoNummer, String verwendungszweck) {
        checkBalance(amount);
        // bis hierhin kommen wir gar nicht erst, wenn in checkBalance() eine Exception aufgetreten ist
        this.kontoStand -= amount;
        this.transactionList.add(new Transaction(gegenKontoNummer, verwendungszweck, -amount));
    }

    /**
     * Wirf eine InsufficientBalanceException, wenn nicht genügend Deckung da ist
     */
    protected void checkBalance(double amount) {
        if (kontoStand < amount) {
            throw new InsufficientBalanceException("Nicht genügend Deckung für Abbuchung");
        }
    }

    public String kontoStatus() {
        return "Konto #" + kontoNummer + " (" + besitzer + ") hat einen Kontostand von "
                + kontoStand + " EUR.";
    }

    public List<Transaction> getTransactionList() {
        return Collections.unmodifiableList(this.transactionList);
    }

    //
    // --- Setter / Getter ---
    //

    public double getKontoStand() {
        return kontoStand;
    }

}
