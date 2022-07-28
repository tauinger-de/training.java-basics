package de.auinger.training.java_basics.exercise12;

import java.util.ArrayList;
import java.util.List;

public class Kunde {

    private final String name;

    private GiroKonto giroKonto;

    private SparKonto sparKonto;

    public Kunde(String name) {
        try {
            ToolsFactory.getNameValidator().validateName(name);
        } catch (ServiceNotAvailableException e) {
            // Name konnte nicht validiert werden... Daher markieren wir ihn durch Klammerung für später
            name = "<<" + name + ">>";
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public GiroKonto getGiroKonto() {
        return giroKonto;
    }

    public void setGiroKonto(GiroKonto giroKonto) {
        this.giroKonto = giroKonto;
    }

    public SparKonto getSparKonto() {
        return sparKonto;
    }

    public void setSparKonto(SparKonto sparKonto) {
        this.sparKonto = sparKonto;
    }

    public List<Konto> getKonten() {
        // wir wollen keine "null" Werte zurückgeben, daher packen wir erstmal alle Konten in die Liste und entfernen dann "null"
        List<Konto> result = new ArrayList<>(List.of(this.giroKonto, this.sparKonto));
        result.remove(null);
        return result;
    }

    public void zeigeTransaktionenAllerKonten() {
        System.out.println("Kontoübersicht für Kunde " + name + ":");
        for (Konto konto : this.getKonten()) {
            System.out.println("- " + konto.kontoStatus());
            for (Transaction trx : konto.getTransactionList()) {
                System.out.println("  - " + trx.toString());
            }
        }
    }

}
