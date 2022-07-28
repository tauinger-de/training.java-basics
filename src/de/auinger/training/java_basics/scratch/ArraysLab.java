package de.auinger.training.java_basics.scratch;

import de.auinger.training.java_basics.exercise10.Konto;

import java.util.ArrayList;

public class ArraysLab {

    public static void main(String[] args) {

        int n;  // aha, int = 4 byte, also im speicher bitte allokieren! alles klar, steht bei 0xf564f56f

        // hat indize 0 .. 9
        int[] arrOfInts = new int[10]; // aha, int = 4 byte, jetzt aber 10 stück, also 40 byte reserv.

        arrOfInts[0] = 100;
        arrOfInts[arrOfInts.length - 1] = 8888;       // länge = 10, letzte index aber 9

        // FOR SCHLEIFE
        for (int i=0; i < arrOfInts.length; i++) {
            System.out.println(arrOfInts[i]);
        }

        // FOR-EACH SCHLEIFE
        for (int wert : arrOfInts) {
            System.out.println(wert);
        }

        // ARRAY-LIST
        ArrayList<Integer> list = new ArrayList<>(9999);
        list.add(100);
        list.get(0);
        list.size(); // == 1
        for (int wert : list) {
            // ...
        }

        ArrayList<Konto> konten = new ArrayList<>();
        konten.add(new Konto("123", "Somebody"));
        for (Konto konto : konten) {
            // ...
        }
    }
}
