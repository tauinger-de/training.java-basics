package de.auinger.training.java_basics;

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

    // todo dieses feld soll "final" sein
    private String kontoNummer;

    private double kontoStand;

    // todo dieses feld soll "final" sein
    private String besitzer;

    //
    // --- Konstruktion ---
    //

    // todo wir brauchen noch einen weiteren Konstruktor, der nur kontoNummer und besitzer benötigt. Der Kontostand soll dann 0.0 sein.

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
        if (kontoStand < amount) {
            System.out.println("Nicht genügend Deckung für Abbuchung");
            return false;
        }
        else {
            this.kontoStand -= amount;
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

    public void setKontoNummer(String kontoNummer) {
        this.kontoNummer = kontoNummer;
    }

    public double getKontoStand() {
        return kontoStand;
    }

    // TODO wir wollen keine setter für den Kontostand!
    public void setKontoStand(double kontoStand) {
        this.kontoStand = kontoStand;
    }

    public void setBesitzer(String besitzer) {
        this.besitzer = besitzer;
    }

}
