package de.auinger.training.java_basics;

// Konto ist die SUPER-Klasse von GiroKonto
// GiroKonto ist die SUB-Klasse von Konto
public class GiroKonto extends Konto {

    /**
     * Ein negativer Wert, der somit den niedrigst-erlaubten Kontostand widerspiegelt.
     */
    private double dispoRahmen;

    public GiroKonto(String kontoNummer, double kontoStand, String besitzer,
                     double dispoRahmen)
    {
        // Konstruktor-Chaining -- wir rufen den Super-Konstruktor auf
        super(kontoNummer, kontoStand, besitzer);
        this.dispoRahmen = dispoRahmen;
    }

    @Override
    public boolean debit(double amount) {
        double neuerKontoStand = getKontoStand() - amount;
        if (neuerKontoStand < dispoRahmen) {
            System.out.println("Nicht genügend Dispo für Abbuchung");
            return false;
        }
        else {
            setKontoStand(neuerKontoStand);
            return true;
        }
    }

}
