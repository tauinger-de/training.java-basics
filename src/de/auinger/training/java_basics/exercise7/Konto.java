package de.auinger.training.java_basics.exercise7;

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

    // TODO dieses feld soll "final" sein
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
        boolean success = debit(amount);
        if (success) {
            zielKonto.credit(amount);
        }
    }

    public void credit(double amount) {
        this.kontoStand += amount;
    }

    public boolean debit(double amount) {
        boolean balanceOkay = checkBalance(amount);
        if (balanceOkay) {
            this.kontoStand -= amount;
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * Gibt `true` zurück, wenn genügend Deckung da ist (positiver Test erfolgreich)
     */
    protected boolean checkBalance(double amount) {
        if (kontoStand < amount) {
            System.out.println("Nicht genügend Deckung für Abbuchung");
            return false;
        }
        else {
            return true;
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
