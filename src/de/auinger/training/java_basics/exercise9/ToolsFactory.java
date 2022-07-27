package de.auinger.training.java_basics.exercise9;

public class ToolsFactory {

    private static final NameValidator NAME_VALIDATOR = new NameValidator();

    public static NameValidator getNameValidator() {
        return NAME_VALIDATOR;
    }
}
