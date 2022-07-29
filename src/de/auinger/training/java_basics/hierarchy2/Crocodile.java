package de.auinger.training.java_basics.hierarchy2;

import java.util.List;

public class Crocodile extends Reptile implements Carnivore {
    @Override
    public int getNumberOfTeeth() {
        return 80;
    }

    @Override
    public float getAverageWeightInKg() {
        return 800f;
    }

    @Override
    public List<String> preferredMeatTypes() {
        return null;
    }
}
