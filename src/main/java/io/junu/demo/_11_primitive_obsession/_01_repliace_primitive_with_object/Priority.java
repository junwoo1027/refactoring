package io.junu.demo._11_primitive_obsession._01_repliace_primitive_with_object;

import java.util.List;

public class Priority {

    private String value;
    private List<String> legalValues = List.of("low", "normal", "high", "rush");

    public Priority(String value) {
        if (legalValues.contains(value))
            this.value = value;
        else
            throw new IllegalArgumentException("Illegal value for priority" + value);
    }

    @Override
    public String toString() {
        return this.value;
    }

    public boolean higherThanOther(Priority other) {
        return this.index() > other.index();
    }

    private int index() {
        return this.legalValues.indexOf(this.value);
    }
}
