package de.auinger.training.java_basics.equals;

import java.util.Objects;
import java.util.UUID;

public class IdentifiedObject {

    private String id;

    public IdentifiedObject() {
        this(UUID.randomUUID().toString());
    }

    public IdentifiedObject(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "[id=" + this.id + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof IdentifiedObject)) return false;
        IdentifiedObject that = (IdentifiedObject) obj;
        return this.id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return id.length();
//        return Objects.hashCode(this.id);
    }
}
