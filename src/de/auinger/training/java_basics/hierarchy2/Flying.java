package de.auinger.training.java_basics.hierarchy2;

public interface Flying {

    int getAverageWingSpanInCm();

    //
    // --- factory methods ---
    //

    static Flying createFlying(boolean withWings) {
        if (withWings) {
            return new Bat();
        } else {
            return new FlyingSnake();
        }
    }

}
