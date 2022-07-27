package de.auinger.training.java_basics.exercise7;

// Konto ist die SUPER-Klasse von GiroKonto
// GiroKonto ist die SUB-Klasse von Konto
public class GiroKonto extends Konto {

    /**
     * Ein negativer Wert, der somit den niedrigst-erlaubten Kontostand widerspiegelt.
     */
    private final double dispoRahmen;

    public GiroKonto(String kontoNummer, double kontoStand, String besitzer,
                     double dispoRahmen)
    {
        // Konstruktor-Chaining -- wir rufen den Super-Konstruktor auf
        super(kontoNummer, kontoStand, besitzer);
        this.dispoRahmen = dispoRahmen;
    }

    @Override
    protected boolean checkBalance(double amount) {
        double neuerKontostand = getKontoStand() - amount;
        if (neuerKontostand < dispoRahmen) {
            System.out.println("Nicht genügend Dispo für Überweisung");
            return false;
        }
        else {
            return true;
        }
    }

    @Override
    public String kontoStatus() {
        return super.kontoStatus() + " Das Konto kann aufgrund des Dispo-Rahmens bis zu einem Kontostand von "
                + this.dispoRahmen + " EUR belastet werden.";
    }
}
