package de.auinger.training.java_basics.scratch;

import de.auinger.training.java_basics.exercise10.GiroKonto;
import de.auinger.training.java_basics.exercise10.Konto;

import java.util.ArrayList;

public class PolymorphieLab {

    public static void main(String[] args) {
        // poly-morphie
        // - poly = mehrfach
        // - morph = gestalt, form

        GiroKonto girokonto = new GiroKonto("123", 0.0, "Thomas", 0.0);

        Konto konto = girokonto;

        Object obj = konto;
        System.out.println(obj.toString());         // top #1 der überschriebenen methoden

        ArrayList<Object> list = new ArrayList<>();
        list.add(konto);
        list.add(12);
        list.add(new IllegalArgumentException());
        for (Object object : list) {
            System.out.println(object.toString());
            if (object instanceof Konto) {
                Konto einKonto = (Konto) object;
                System.out.println("Konto gefunden! KontoNr ist: " + ((Konto)einKonto).getKontoNummer());
            }
        }

        int i = 130;
        byte b = (byte) i;
        System.out.println("byte = " + b);

        System.out.println(0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1);

//        System.out.println(girokonto.kontoStatus());
//        System.out.println(konto.kontoStatus());
//
//        System.out.println(konto instanceof Konto);
//        System.out.println(konto instanceof GiroKonto);
//
//        System.out.println(konto.getClass());
    }

    public static void upCasting() {
        Konto konto = new GiroKonto("123", 0.0, "Thomas", 0.0);

        // ...

        GiroKonto giroKonto = (GiroKonto) konto;
        giroKonto.getDispoRahmen();

//        GiroKonto girokonto = konto;
    }


}
