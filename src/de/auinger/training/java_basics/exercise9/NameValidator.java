package de.auinger.training.java_basics.exercise9;

public class NameValidator {

    private int callCount = 0;

    public void validateName(String name) throws ServiceNotAvailableException {
        // service down?
        callCount++;
        if (callCount % 2 == 0) {
            throw new ServiceNotAvailableException("Sorry, der Service ist gerade nicht verfügbar. Bitte probieren Sie es gleich nochmal...");
        }

        // validate name
        if (name == null || name.length() < 5) {
            throw new IllegalArgumentException("Der Name ist nicht gültig");
        }
    }
}
