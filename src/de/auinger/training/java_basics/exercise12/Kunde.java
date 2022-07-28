package de.auinger.training.java_basics.exercise12;

import java.util.ArrayList;

public class Kunde {

    private final String name;

    private final ArrayList<Konto> konten;

    public Kunde(String name) {
        try {
            ToolsFactory.getNameValidator().validateName(name);
        } catch (ServiceNotAvailableException e) {
            // Name konnte nicht validiert werden... Daher markieren wir ihn durch Klammerung für später
            name = "<<" + name + ">>";
        }
        this.name = name;
        this.konten = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setGiroKonto(GiroKonto giroKonto) {
        this.konten.add(giroKonto);
    }

    public void setSparKonto(SparKonto sparKonto) {
        this.konten.add(sparKonto);
    }

    public void zeigeTransaktionenAllerKonten() {
        System.out.println("Kontoübersicht für Kunde " + name + ":");
        for (Konto konto : this.konten) {
            System.out.println("- " + konto.kontoStatus());
            for (Transaction trx : konto.getTransactionList()) {
                System.out.println("  - " + trx.toString());
            }
        }
    }

}
