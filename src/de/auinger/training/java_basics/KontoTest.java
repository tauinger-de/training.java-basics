package de.auinger.training.java_basics;

public class KontoTest {

    public static void main(String[] args) {

        GiroKonto meinKonto = new GiroKonto(
                "123-436",
                1000.0,
                "Enrico Pallazzo",
                -200.0);

        System.out.println(meinKonto.kontoStatus());

        Konto anderesKonto = new Konto(
                "88-333-000001",
                0.0,
                "Herr Pleite Geier"
        );

        meinKonto.transfer(anderesKonto, 1_201.0);

        System.out.println(meinKonto.kontoStatus());
        System.out.println(anderesKonto.kontoStatus());
    }

}
