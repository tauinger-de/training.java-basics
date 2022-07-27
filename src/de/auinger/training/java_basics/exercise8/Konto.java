package de.auinger.training.java_basics.exercise8;

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

    //
    // --- Konstruktion ---
    //


    public Konto(String kontoNummer, String besitzer) {
        this(kontoNummer, 0.0, besitzer);
    }

    // ein Konstruktor ist auch nur eine Methode mit einem Namen. Der
    // analog der Klasse lautet und *NICHT* direkt aufgerufen werden kann.
    public Konto(String kontoNummer, double kontoStand, String besitzer) {
        this.kontoNummer = kontoNummer;
        this.kontoStand = kontoStand;
        this.besitzer = besitzer;
    }

    //
    // --- Geschäftslogik ---
    //

    public void transfer(Konto zielKonto, double amount) {
        debit(amount);
        // bis hierhin kommen wir gar nicht erst, wenn in debit() eine Exception aufgetreten ist
        zielKonto.credit(amount);
    }

    public void credit(double amount) {
        this.kontoStand += amount;
    }

    public void debit(double amount) {
        checkBalance(amount);
        // bis hierhin kommen wir gar nicht erst, wenn in checkBalance() eine Exception aufgetreten ist
        this.kontoStand -= amount;
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

    //
    // --- Setter / Getter ---
    //

    public double getKontoStand() {
        return kontoStand;
    }

}
