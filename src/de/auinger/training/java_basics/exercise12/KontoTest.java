package de.auinger.training.java_basics.exercise12;

public class KontoTest {

    public static void main(String[] args) {
        GiroKonto enricosGiroKonto = new GiroKonto(
                "123-456",
                1000.0,
                -200.0);
        SparKonto enricosSparKonto = new SparKonto("777-000000000001");

        Kunde enrico = new Kunde("Enrico Pallazzo");
        enrico.setGiroKonto(enricosGiroKonto);
        enrico.setSparKonto(enricosSparKonto);

        System.out.println("-----------------");
        try {
            enricosGiroKonto.transfer(enricosSparKonto, 250.00, "Umbuchung auf Sparkonto");
            System.out.println("Transfer erfolgreich");
        } catch (InsufficientBalanceException e) {
            System.out.println("FEHLER: Tut mir leid, die Überweisung hat nicht geklappt: " + e.getMessage());
        }

        System.out.println("-----------------");
        enrico.zeigeTransaktionenAllerKonten();
    }

}
