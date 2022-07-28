package de.auinger.training.java_basics.scratch.api;

import de.auinger.training.java_basics.scratch.api.impl.JsonSerializer;

import java.util.List;
import java.util.Map;

public class WriterApp {

    public static void main(String[] args) {
        Serializer objectProcessor = new JsonSerializer();
        objectProcessor.serializeObjects(List.of(new Shark()));
    }
}


class Shark implements IdHolder {

    @Override
    public String getId() {
        return null;
    }

    @Override
    public Map<String, Object> getAttributes() {
        return null;
    }
}