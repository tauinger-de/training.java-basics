package de.auinger.training.java_basics.hierarchy2;

public abstract class Vertebrate {

    public abstract float getAverageWeightInKg();

    @Override
    public String toString() {
        return getClass().getSimpleName() + " (avg. weight=" + getAverageWeightInKg() + "kg)";
    }
}
