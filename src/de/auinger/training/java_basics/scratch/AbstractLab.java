package de.auinger.training.java_basics.scratch;

import java.util.Collections;
import java.util.List;
import java.util.SortedSet;

public class AbstractLab {

    private static Shark fish = new Shark();
    private static RainbowTrout fish2 = new RainbowTrout();

    public static void main(String[] args) {
        fish.sayHello();
        fish2.sayHello();

        SaltWaterAnimal bruce = new Shark();
        SaltWaterAnimal saltWaterAnimal = fish;
        SaltWaterAnimal saltWaterAnimal2 = new AustralianSaltWaterCrocodile();
        List<SaltWaterAnimal> listOfSaltWaterAnimals = List.of(bruce, saltWaterAnimal, saltWaterAnimal2);

        for (SaltWaterAnimal element : listOfSaltWaterAnimals) {
            System.out.println(element.getFavoriteSaltDensity());
        }

        //Collections.sort(List.of(fish));
        Collections.sort(List.of(fish2));
    }

}

// API = Application Programming Interface

interface SaltWaterAnimal {

    int getFavoriteSaltDensity();

}


abstract class Fish {

    public void sayHello() {
        System.out.println("Hello, I am a " + getNameOfSpecies());
    }

    /**
     * Gibt den Wert der Überkohorte zurück.
     */
    abstract String getNameOfSpecies();
}

class Shark extends Fish implements SaltWaterAnimal {
    @Override
    String getNameOfSpecies() {
        return "Euselachii";
    }

    @Override
    public int getFavoriteSaltDensity() {
        return 12;
    }
}

abstract class Trout extends Fish implements Comparable<Trout> {

    @Override
    public int compareTo(Trout o) {
        return 0;
    }

}

class RainbowTrout extends Trout {

    @Override
    String getNameOfSpecies() {
        return "Oncorhynchus mykiss";
    }
}


class AustralianSaltWaterCrocodile implements SaltWaterAnimal {

    @Override
    public int getFavoriteSaltDensity() {
        return 21;
    }

}