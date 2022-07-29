package de.auinger.training.java_basics.hierarchy;

// https://de.wikipedia.org/wiki/Schmuckbaumnattern
public class FlyingSnake extends Reptile implements Flying {
    @Override
    public int getNumberOfTeeth() {
        return 2;
    }

    @Override
    public float getAverageWeightInKg() {
        return 2.4f;
    }

    @Override
    public int getAverageWingSpanInCm() {
        return 0;
    }
}
