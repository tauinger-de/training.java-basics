package de.auinger.training.java_basics.hierarchy2;

import java.util.List;

public interface Carnivore {

    List<String> preferredMeatTypes();

    //
    // --- factory methods ---
    //

    static Carnivore createCarnivore(boolean flying, boolean large) {
        if (flying) {
            if (large) {
                throw new IllegalArgumentException("Sorry, there is no flying large carnivore in our zoo");
            } else {
                return new Bat();
            }
        } else {
            if (large) {
                return new Orca();
            } else {
                return new Crocodile();
            }
        }
    }
}
