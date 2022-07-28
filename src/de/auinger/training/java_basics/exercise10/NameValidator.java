package de.auinger.training.java_basics.exercise10;

public class NameValidator {

    private int callCount = 0;

    private String[] badWords;

    public NameValidator(String[] badWords) {
        this.badWords = badWords;
    }

    public void validateName(String name) throws ServiceNotAvailableException {
        // service down?
        callCount++;
        if (callCount % 2 == 0) {
            throw new ServiceNotAvailableException("Sorry, der Service ist gerade nicht verfügbar. Bitte probieren Sie es gleich nochmal...");
        }

        // validate bad word existence
        for (String badWord : badWords) {
            if (name.toLowerCase().contains(badWord.toLowerCase())) {
                throw new IllegalArgumentException("Der Name enthält das unzulässige Wort '" + badWord + "'");
            }
        }

        // validate name length
        if (name == null || name.length() < 5) {
            throw new IllegalArgumentException("Der Name ist zu kurz");
        }
    }
}
