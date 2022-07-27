package de.auinger.training.java_basics.exercise9;

import de.auinger.training.java_basics.scratch.VersionInfo;

public class KontoTest {

    public static void main(String[] args) {

        System.out.println(VersionInfo.getVersionWithBuildDate());

        GiroKonto meinKonto = new GiroKonto(
                "123-456",
                1000.0,
                "Enrico Pallazzo",
                -200.0);
        System.out.println(meinKonto.kontoStatus());

        Konto anderesKonto = new Konto(
                "88-333-000001",
                0.0,
                "Herr Pleite Geier"
        );
        System.out.println(anderesKonto.kontoStatus());

        System.out.println("-----------------");
        try {
            meinKonto.transfer(anderesKonto, 1_299.0);
        } catch (InsufficientBalanceException e) {
            System.out.println("FEHLER: Tut mir leid, die Überweisung hat nicht geklappt: " + e.getMessage());
        }

        System.out.println("-----------------");
        System.out.println(meinKonto.kontoStatus());
        System.out.println(anderesKonto.kontoStatus());
    }

}
