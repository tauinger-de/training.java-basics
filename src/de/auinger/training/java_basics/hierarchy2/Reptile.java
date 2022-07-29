package de.auinger.training.java_basics.hierarchy2;

public abstract class Reptile extends Vertebrate {

    public abstract int getNumberOfTeeth();

    @Override
    public String toString() {
        return getClass().getSimpleName() + " (teeth=" + getNumberOfTeeth() + ", avg. weight=" + getAverageWeightInKg() + "kg)";
    }

}
