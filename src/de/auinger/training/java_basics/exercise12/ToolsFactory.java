package de.auinger.training.java_basics.exercise12;

public class ToolsFactory {

    private static final NameValidator NAME_VALIDATOR = new NameValidator(new String[] { "Muster", "Beispiel" });

    public static NameValidator getNameValidator() {
        return NAME_VALIDATOR;
    }
}
