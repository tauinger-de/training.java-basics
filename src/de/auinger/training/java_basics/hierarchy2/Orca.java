package de.auinger.training.java_basics.hierarchy2;

import java.util.List;

public
class Orca extends Whale implements Carnivore {
    @Override
    public float getAverageWeightInKg() {
        return 6_000f;
    }

    @Override
    public List<String> preferredMeatTypes() {
        return null;
    }
}
