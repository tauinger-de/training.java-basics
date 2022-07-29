package de.auinger.training.java_basics.hierarchy2;

import java.util.List;

public class Bat extends Mammal implements Carnivore, Flying {

    @Override
    public int getAverageWingSpanInCm() {
        return 16;
    }

    @Override
    public List<String> preferredMeatTypes() {
        return List.of("Insekten");
    }

    @Override
    public float getAverageWeightInKg() {
        return 0.1f;
    }
}
