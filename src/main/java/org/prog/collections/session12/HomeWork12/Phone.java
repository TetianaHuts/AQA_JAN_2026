package org.prog.collections.session12.HomeWork12;

import java.util.Objects;

public class Phone {
    private String model;

    public Phone(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return model;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return Objects.equals(model, phone.model);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(model);
    }
}
